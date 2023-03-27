package com.gcc.gccmap.controller;

import com.gcc.gccmap.model.vo.ShowUserInfo;
import com.gcc.gccmap.service.UserService;
import com.gcc.gccmap.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@Api(value = "用户控制层", tags = { "用户访问接口" })
public class UserController {
    @Resource
    private UserService userService;

    @ApiOperation(value = "后台自动获取userId查询用户信息")
    @GetMapping("/user/queryUserInfo")
    public ResponseResult queryUserInfo() throws Exception {
        return userService.queryUserInfo();
    }

    @ApiOperation(value = "更新用户个人信息")
    @PutMapping("/user/updateUserInfo")
    public ResponseResult updateUserInfo(@Valid @RequestBody ShowUserInfo userVO){
        return userService.updateUserInfo(userVO);
    }


}
