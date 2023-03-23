package com.gcc.gccmap.service;

import com.gcc.gccmap.util.ResponseResult;

public interface EmailSendService {
    ResponseResult sendCode(String email);
}
