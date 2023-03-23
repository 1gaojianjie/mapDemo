package com.gcc.gccmap.service;

import com.gcc.gccmap.model.vo.GeneralUserInfo;
import com.gcc.gccmap.util.ResponseResult;

public interface RegistrationService {

    ResponseResult registered(GeneralUserInfo registerVO);
}
