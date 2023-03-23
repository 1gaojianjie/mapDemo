package com.gcc.gccmap.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.gcc.gccmap.config.RedisCache;
import com.gcc.gccmap.mapper.UserMapper;
import com.gcc.gccmap.enums.ResponseStatus;
import com.gcc.gccmap.exception.CodeTimeoutException;
import com.gcc.gccmap.exception.EmailNotExistException;
import com.gcc.gccmap.exception.VerificationCodeErrorException;
import com.gcc.gccmap.model.entity.User;
import com.gcc.gccmap.model.vo.GeneralUserInfo;
import com.gcc.gccmap.service.RecoverService;
import com.gcc.gccmap.util.ResponseResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

@Service
public class RecoverServiceImpl implements RecoverService {
    @Resource
    private UserMapper userMapper;

    @Resource
    private RedisCache redisCache;

    @Override
    public ResponseResult recoverPassword(GeneralUserInfo userInfo) throws EmailNotExistException {
        //查询数据库中是否存在该邮箱
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getEmail, userInfo.getEmail());
        User user = userMapper.selectOne(queryWrapper);
        if(Objects.isNull(user))
            throw new EmailNotExistException("该邮箱未注册");

        //从redis中通过注册邮箱获取验证码
        String verificationCode = redisCache.getCacheObject(userInfo.getEmail());

        //判断验证码是否超时
        if(verificationCode == null)
            throw new CodeTimeoutException("请检查账号是否正确或验证码超时");

        //判断验证码是否匹配
        if(!verificationCode.equals(userInfo.getEmailCode()))
            throw new VerificationCodeErrorException("验证码输入错误");

        User updateUser = new User();
        BeanUtils.copyProperties(userInfo,updateUser);
        LambdaUpdateWrapper<User> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper.eq(User::getEmail,userInfo.getEmail());
        userMapper.update(updateUser,updateWrapper);

        //更新成功后移除redis中的验证码
        redisCache.deleteObject(userInfo.getEmail());
        return new ResponseResult(ResponseStatus.SUCCESS.getCode(), ResponseStatus.SUCCESS.getMessage());
    }


}
