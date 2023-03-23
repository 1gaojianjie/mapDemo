package com.gcc.gccmap.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.gcc.gccmap.config.RedisCache;
import com.gcc.gccmap.mapper.UserAndRoleMapper;
import com.gcc.gccmap.mapper.UserIdentityMapper;
import com.gcc.gccmap.mapper.UserMapper;
import com.gcc.gccmap.enums.ResponseStatus;
import com.gcc.gccmap.exception.CodeTimeoutException;
import com.gcc.gccmap.exception.EmailExistException;
import com.gcc.gccmap.exception.VerificationCodeErrorException;
import com.gcc.gccmap.model.entity.User;
import com.gcc.gccmap.model.entity.UserAndRole;
import com.gcc.gccmap.model.entity.UserIdentity;
import com.gcc.gccmap.model.vo.GeneralUserInfo;
import com.gcc.gccmap.service.RegistrationService;
import com.gcc.gccmap.util.ResponseResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    @Resource
    private UserMapper userMapper;

    @Resource
    private UserIdentityMapper userIdentityMapper;

    @Resource
    private UserAndRoleMapper userAndRoleMapper;

    @Resource
    private RedisCache redisCache;

    @Override
    public ResponseResult registered(GeneralUserInfo registerVO) {
        //查询数据库中是否存在该邮箱
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getEmail, registerVO.getEmail());
        User user = userMapper.selectOne(queryWrapper);
        if (!Objects.isNull(user))
            throw new EmailExistException("该邮箱已存在");

        //从redis中通过注册邮箱获取验证码
        String verificationCode = redisCache.getCacheObject(registerVO.getEmail());

        //判断验证码是否超时
        if (verificationCode == null)
            throw new CodeTimeoutException("请检查账号是否正确或验证码超时");

        //判断验证码是否匹配
        if (!verificationCode.equals(registerVO.getEmailCode()))
            throw new VerificationCodeErrorException("验证码输入错误");
        User insertUser = new User();
        BeanUtils.copyProperties(registerVO, insertUser);
        if (userMapper.insert(insertUser) != 1)
            return new ResponseResult(ResponseStatus.FAIL.getCode(), ResponseStatus.FAIL.getMessage());

        //创建用户成功后填充userIdentity表id信息
        User temp = userMapper.selectOne(new LambdaQueryWrapper<User>().eq(User::getEmail, registerVO.getEmail()));
        UserIdentity userIdentity = new UserIdentity();
        userIdentity.setUserId(temp.getUserId());
        userIdentityMapper.insert(userIdentity);

        //为注册用户赋予普通权限
        userAndRoleMapper.insert(new UserAndRole(temp.getUserId(), 2));

        //注册成功后移除redis中的验证码
        redisCache.deleteObject(registerVO.getEmail());
        return new ResponseResult(ResponseStatus.SUCCESS.getCode(), ResponseStatus.SUCCESS.getMessage());
    }
}
