package com.gcc.gccmap.service;

import com.gcc.gccmap.exception.EmailNotExistException;
import com.gcc.gccmap.model.vo.GeneralUserInfo;
import com.gcc.gccmap.util.ResponseResult;

public interface RecoverService {
    ResponseResult recoverPassword(GeneralUserInfo userInfo) throws EmailNotExistException;
}
