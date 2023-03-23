package com.gcc.gccmap.interceptor;

import com.alibaba.fastjson.JSON;
import com.gcc.gccmap.config.RedisCache;
import com.gcc.gccmap.enums.ResponseStatus;
import com.gcc.gccmap.util.JwtUtil;
import com.gcc.gccmap.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
/**
 * 权限拦截器
 * 拦截登录、注册、找回密码、发送验证码以外的所有请求
 */
@Component
public class PermissionInterceptor implements HandlerInterceptor {
    @Autowired
    private RedisCache redisCache;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取用户id
        String userId = JwtUtil.getCurrentUserId();
        //获取请求路径
        String requestURI = request.getRequestURI();
        //获取当前用户的权限
        List<String> userPermissions = redisCache.getCacheObject("permission:" + userId);

        for (String userPermission : userPermissions) {
            if(requestURI.contains(userPermission))
                return true;
        }
        JwtUtil.returnJson(response, JSON.toJSONString(new ResponseResult(ResponseStatus.FAIL.getCode(), "权限不足,请联系管理员")));
        return false;
    }
}
