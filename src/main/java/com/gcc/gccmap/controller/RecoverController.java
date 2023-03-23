package com.gcc.gccmap.controller;

import com.gcc.gccmap.exception.EmailNotExistException;
import com.gcc.gccmap.model.vo.GeneralUserInfo;
import com.gcc.gccmap.service.RecoverService;
import com.gcc.gccmap.util.ResponseResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@Api(value = "重置密码控制层", tags = { "重置密码访问接口" })
public class RecoverController {
    @Resource
    private RecoverService recoverService;

    @PostMapping("/user/recoverPwd")
    public ResponseResult recoverPassword(@Valid @RequestBody GeneralUserInfo userInfo) throws EmailNotExistException {
        return recoverService.recoverPassword(userInfo);
    }

}
