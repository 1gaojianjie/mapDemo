package com.gcc.gccmap.controller;

import com.gcc.gccmap.model.vo.GeneralUserInfo;
import com.gcc.gccmap.service.RegistrationService;
import com.gcc.gccmap.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;


@RestController
@Api(value = "注册控制层", tags = { "注册访问接口" })
public class RegistrationController {
    @Resource
    RegistrationService registrationService;

    //注册接口
    @ApiOperation(value = "注册接口")
    @PostMapping("/user/Register")
    public ResponseResult Register(@Valid @RequestBody GeneralUserInfo registerVO){
        return registrationService.registered(registerVO);
    }

}
