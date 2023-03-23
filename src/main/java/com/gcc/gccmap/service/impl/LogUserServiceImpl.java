package com.gcc.gccmap.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gcc.gccmap.config.RedisCache;
import com.gcc.gccmap.mapper.PermissionMapper;
import com.gcc.gccmap.mapper.UserMapper;
import com.gcc.gccmap.exception.IllegalTokenException;
import com.gcc.gccmap.exception.PasswordErrorException;
import com.gcc.gccmap.exception.UserNotExistException;
import com.gcc.gccmap.model.entity.User;
import com.gcc.gccmap.model.vo.LoginUserInfo;
import com.gcc.gccmap.service.LogUserService;
import com.gcc.gccmap.util.JwtUtil;
import com.gcc.gccmap.util.ResponseResult;
import com.gcc.gccmap.util.ThreadLocalUtil;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * 登录认证实现类
 **/
@Service
public class LogUserServiceImpl extends ServiceImpl<UserMapper, User> implements LogUserService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private RedisCache redisCache;
    @Resource
    private PermissionMapper permissionMapper;

    @Override
    public ResponseResult queryUserByEmail(LoginUserInfo loginUserInfo) throws PasswordErrorException {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getEmail, loginUserInfo.getEmail());
        User user = userMapper.selectOne(wrapper);

        //判断从数据库中通过emil查询的user对象是否存在
        if (Objects.isNull(user))
            throw new UserNotExistException("用户名或密码错误");

        //user存在则匹配密码是否相符
        if (!user.getPassword().equals(loginUserInfo.getPassword()))
            throw new PasswordErrorException("用户名或密码错误");

        //账号验证成功，将user信息以login:+id为键存入redis,期效为5天
        redisCache.setCacheObject("login:" + user.getUserId(), user, 5, TimeUnit.DAYS);

        //设userid为密钥，作为token发送给前端,密钥期效为5天
        String token = JwtUtil.createJWT(user.getUserId().toString(), JwtUtil.JWT_TTL_DAY);

        //以token为键，user为值存入threadLocal中
        ThreadLocalUtil.addCurrentUserToken(token);
        Map<String, String> map = new HashMap<>();
        map.put("token", token);

        //将user的类型返回给前端
        String userType = permissionMapper.queryUserType(user.getUserId().toString());
        map.put("userType", userType);

        //将用户权限缓存到redis中,期效为5天
        redisCache.setCacheObject("permission:" + user.getUserId(), permissionMapper.queryPermissionByUserId(user.getUserId().toString()), 5, TimeUnit.DAYS);
        return new ResponseResult(200, "登陆成功", map);
    }

    @Override
    public ResponseResult logout() {
        String token = ThreadLocalUtil.getCurrentUserToken();
        String userId = null;
        try {
            //解析token为userId
            Claims claims = JwtUtil.parseJWT(token);
            userId = claims.getSubject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalTokenException("token解析异常");
        }
        //移除redis中的用户信息,退出成功
        redisCache.deleteObject("login:" + userId);
        return new ResponseResult(200, "退出成功");
    }
}
