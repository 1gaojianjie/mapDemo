package com.gcc.gccmap.service;

import com.gcc.gccmap.model.dto.CanteenDTO;
import com.gcc.gccmap.model.vo.LocationInfo;
import com.gcc.gccmap.util.ResponseResult;

public interface CanteenService {
    ResponseResult queryCanteenInfo(LocationInfo locationInfo);

    ResponseResult queryCanteen(LocationInfo locationInfo);

    ResponseResult updateCanteenInfo(CanteenDTO canteenDTO);
}
