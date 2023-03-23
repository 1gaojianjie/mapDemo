package com.gcc.gccmap.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gcc.gccmap.exception.PasswordErrorException;
import com.gcc.gccmap.model.entity.User;
import com.gcc.gccmap.model.vo.LoginUserInfo;
import com.gcc.gccmap.util.ResponseResult;


/**
 * 登录认证接口
**/
public interface LogUserService extends IService<User> {
    ResponseResult queryUserByEmail(LoginUserInfo loginUserInfo) throws PasswordErrorException;

    ResponseResult logout();
}
