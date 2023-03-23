package com.gcc.gccmap.service;

import com.gcc.gccmap.model.dto.ClassroomDTO;
import com.gcc.gccmap.model.vo.ClassroomDel;
import com.gcc.gccmap.util.ResponseResult;

import java.util.List;

public interface ClassroomService {
    List<ClassroomDTO> queryClassroomByBuildingId(Integer buildingId);

    ResponseResult updateClassByBuildingIdAndClassId(ClassroomDTO classroom);

    ResponseResult insertClassroom(ClassroomDTO classroom);

    ResponseResult deleteClassroom(ClassroomDel classroom);
}
