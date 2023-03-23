package com.gcc.gccmap.service;

import com.gcc.gccmap.model.dto.TeachingBuildingDTO;
import com.gcc.gccmap.model.vo.LocationInfo;
import com.gcc.gccmap.util.ResponseResult;

public interface TeachingBuildingService {
    ResponseResult queryTeachingBuilding(LocationInfo locationInfo);

    ResponseResult queryTeachingBuildingInfo(LocationInfo locationInfo);

    ResponseResult updateBuildingInfo(TeachingBuildingDTO teachingBuilding);
}
