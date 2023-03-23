package com.gcc.gccmap.controller;

import com.gcc.gccmap.service.EmailSendService;
import com.gcc.gccmap.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.validation.constraints.Pattern;


@RestController
@Validated
@Api(value = "邮箱控制层", tags = { "邮箱访问接口" })
public class EmailController {
    @Resource
    EmailSendService emailSendService;

    //发送验证码接口
    @ApiOperation(value = "发送验证码接口")
    @GetMapping("/sendEmailCode")
    public ResponseResult sendEmailCode(@RequestParam(value = "email")  @Pattern(regexp = "^(\\w+([-.][A-Za-z0-9]+)*){3,18}@\\w+([-.][A-Za-z0-9]+)*\\.\\w+([-.][A-Za-z0-9]+)*$",message = "邮箱格式有误") String email){
        return emailSendService.sendCode(email);
    }
}
