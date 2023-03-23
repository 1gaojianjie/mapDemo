package com.gcc.gccmap.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.gcc.gccmap.config.RedisCache;
import com.gcc.gccmap.mapper.UserIdentityMapper;
import com.gcc.gccmap.mapper.UserMapper;
import com.gcc.gccmap.enums.ResponseStatus;
import com.gcc.gccmap.exception.UserNotExistException;
import com.gcc.gccmap.model.entity.User;
import com.gcc.gccmap.model.entity.UserIdentity;
import com.gcc.gccmap.model.vo.ShowUserInfo;
import com.gcc.gccmap.service.UserService;
import com.gcc.gccmap.util.JwtUtil;
import com.gcc.gccmap.util.ResponseResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author gjj
 * @since 2023-03-14
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Resource
    private UserIdentityMapper userIdentityMapper;

    @Resource
    private RedisCache redisCache;

    @Override
    public ResponseResult queryUserInfo(){
        //获取userId
        String userId = JwtUtil.getCurrentUserId();

        //查询user表的部分信息
        User userPart1 = userMapper.selectOne(new LambdaQueryWrapper<User>().eq(User::getUserId, userId));
        if(Objects.isNull(userPart1))
            throw new UserNotExistException("系统繁忙,请稍后重试(查询)");

        //查询userIdentity表的部分信息
        UserIdentity userPart2 = userIdentityMapper.selectOne(new LambdaQueryWrapper<UserIdentity>().eq(UserIdentity::getUserId, userId));
        if(Objects.isNull(userPart2))
            throw new UserNotExistException("系统繁忙,请稍后重试(查询)");
        ShowUserInfo showUserInfo = new ShowUserInfo();
        BeanUtils.copyProperties(userPart1, showUserInfo);
        BeanUtils.copyProperties(userPart2, showUserInfo);
        Map<String,Object> map = new HashMap<>();
        String newToken = JwtUtil.flushToken(redisCache);
        map.put("UserInfo", showUserInfo);
        map.put("token",newToken);
        return new ResponseResult(ResponseStatus.SUCCESS.getCode(),ResponseStatus.SUCCESS.getMessage(),map);
    }


    //更新个人信息
    @Transactional
    @Override
    public ResponseResult updateUserInfo(ShowUserInfo userInfo) {
        //获取userId
        String userId = JwtUtil.getCurrentUserId();
        userInfo.setUserId(Integer.valueOf(userId));
        int i = userMapper.updateUser(userInfo);
        int j = userIdentityMapper.updateUserIdentity(userInfo);
        if(i+j<2)
            throw new RuntimeException("系统繁忙,请稍后重试");
        Map<String,Object> map = new HashMap<>();
        String newToken = JwtUtil.flushToken(redisCache);
        map.put("token",newToken);
        return new ResponseResult(ResponseStatus.SUCCESS.getCode(),ResponseStatus.SUCCESS.getMessage());
    }
}
