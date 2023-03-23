package com.gcc.gccmap.service;

import com.gcc.gccmap.model.dto.DormitoryBuildingDTO;
import com.gcc.gccmap.model.vo.LocationInfo;
import com.gcc.gccmap.util.ResponseResult;

public interface DormitoryBuildingService {
    ResponseResult queryDormitoryBuilding(LocationInfo locationInfo);

    ResponseResult updateDormitoryInfo(DormitoryBuildingDTO dormitoryBuildingDTO);
}
