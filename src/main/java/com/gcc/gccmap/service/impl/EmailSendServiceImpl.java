package com.gcc.gccmap.service.impl;

import com.gcc.gccmap.enums.ResponseStatus;
import com.gcc.gccmap.service.EmailSendService;
import com.gcc.gccmap.common.EmailSendCodeUtil;
import com.gcc.gccmap.util.ResponseResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmailSendServiceImpl implements EmailSendService {
    @Resource
    EmailSendCodeUtil emailSendCodeUtil;

    @Override
    public ResponseResult sendCode(String email) {

        //向目标邮箱发送验证码，主题GccMap
        if(emailSendCodeUtil.sendEmail(email,"GccMap"))
            return new ResponseResult(ResponseStatus.SUCCESS.getCode(),ResponseStatus.SUCCESS.getMessage());

        return new ResponseResult(ResponseStatus.FAIL.getCode(),ResponseStatus.FAIL.getMessage());
    }
}
