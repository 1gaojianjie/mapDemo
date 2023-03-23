package com.gcc.gccmap.service;

import com.gcc.gccmap.model.vo.ShowUserInfo;
import com.gcc.gccmap.util.ResponseResult;

public interface UserService {
    ResponseResult queryUserInfo() throws Exception;

    ResponseResult updateUserInfo(ShowUserInfo userVO);
}
