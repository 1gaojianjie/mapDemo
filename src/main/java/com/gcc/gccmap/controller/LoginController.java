package com.gcc.gccmap.controller;

import com.gcc.gccmap.exception.PasswordErrorException;
import com.gcc.gccmap.model.vo.LoginUserInfo;
import com.gcc.gccmap.service.LogUserService;
import com.gcc.gccmap.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@Api(value = "登录及登出控制层", tags = { "登录及登出访问接口" })
public class LoginController {
    @Resource
    private LogUserService logUserService;


    //用户登录接口
    @PostMapping("/login/user")
    @ApiOperation(value = "用户登录接口")
    public ResponseResult login(@Valid @RequestBody LoginUserInfo loginUserInfo) throws PasswordErrorException {
        return logUserService.queryUserByEmail(loginUserInfo);
    }

    //用户登出接口
    @ApiOperation(value = "用户登出接口")
    @GetMapping("/logout/user")
    public ResponseResult logout(){
        return logUserService.logout();
    }


}
