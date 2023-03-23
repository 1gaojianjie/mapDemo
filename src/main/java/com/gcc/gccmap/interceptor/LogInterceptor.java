package com.gcc.gccmap.interceptor;

import com.gcc.gccmap.config.RedisCache;
import com.gcc.gccmap.exception.IllegalTokenException;
import com.gcc.gccmap.exception.UserNotLoggedException;
import com.gcc.gccmap.model.entity.User;
import com.gcc.gccmap.util.JwtUtil;
import com.gcc.gccmap.util.ThreadLocalUtil;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * 拦截登录、注册、找回密码、发送验证码以外的所有请求
 */
@Component
public class LogInterceptor implements HandlerInterceptor {
    @Autowired
    private RedisCache redisCache;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception {
        String token = request.getHeader("token");
        //如果token为空则抛出异常
        if (!StringUtils.hasText(token)) {
            throw new UserNotLoggedException("用户未登录");
        }
        //token不为空则将token解析为userId
        String userid = null;
        try {
            Claims claims = JwtUtil.parseJWT(token);
            userid = claims.getSubject();
        } catch (Exception e) {
            throw new IllegalTokenException("使用非法token");
        }
        //查看redis中是否存在用户信息
        User user = redisCache.getCacheObject("login:" + userid);
        if (Objects.isNull(user)) {
            throw new UserNotLoggedException("用户未登录");
        }
        //将token添加到当前线程的ThreadLocal
        ThreadLocalUtil.addCurrentUserToken(token);
        return true;

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)throws Exception {

        //请求结束,清除ThreadLocal数据
        ThreadLocalUtil.remove();
    }
}
