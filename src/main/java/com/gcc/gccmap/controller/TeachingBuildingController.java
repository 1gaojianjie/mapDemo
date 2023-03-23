package com.gcc.gccmap.controller;

import com.gcc.gccmap.model.dto.ClassroomDTO;
import com.gcc.gccmap.model.dto.TeachingBuildingDTO;
import com.gcc.gccmap.model.vo.ClassroomDel;
import com.gcc.gccmap.model.vo.LocationInfo;
import com.gcc.gccmap.service.ClassroomService;
import com.gcc.gccmap.service.TeachingBuildingService;
import com.gcc.gccmap.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@Api(value = "教学楼控制层", tags = { "教学楼访问接口" })
public class TeachingBuildingController {
    @Resource
    private TeachingBuildingService teachingBuildingService;

    @Resource
    private ClassroomService classroomService;

    //通过教学楼id和课室id更新课室数据
    @ApiOperation(value = "通过教学楼id和课室id更新课室数据")
    @PostMapping("/updateClassByBuildingIdAndClassId")
    public ResponseResult updateClassByBuildingIdAndClassId(@Valid @RequestBody ClassroomDTO classroomDTO){
        return classroomService.updateClassByBuildingIdAndClassId(classroomDTO);
    }

    //通过教学楼id和课室id添加课室
    @ApiOperation(value = "通过教学楼id和课室id添加课室")
    @PostMapping("/insertClassroom")
    public ResponseResult insertClassroom(@Valid @RequestBody ClassroomDTO classroomDTO){
        return classroomService.insertClassroom(classroomDTO);
    }

    //通过教学楼id和课室id删除课室
    @ApiOperation(value = "通过教学楼id和课室id删除课室")
    @PostMapping("/deleteClassroom")
    public ResponseResult deleteClassroom(@Valid @RequestBody ClassroomDel classroom){
        return classroomService.deleteClassroom(classroom);
    }

    //通过坐标查询教学楼信息
    @ApiOperation(value = "通过坐标查询教学楼信息")
    @PostMapping("/queryTeachingBuilding")
    public ResponseResult queryTeachingBuilding(@Valid @RequestBody LocationInfo locationInfo){
        return teachingBuildingService.queryTeachingBuilding(locationInfo);
    }

    //通过坐标查询教学楼所有课室
    @ApiOperation(value = "通过坐标查询教学楼所有课室")
    @PostMapping("/queryTeachingBuildingInfo")
    public ResponseResult queryTeachingBuildingInfo(@Valid @RequestBody LocationInfo locationInfo){
        return teachingBuildingService.queryTeachingBuildingInfo(locationInfo);
    }

    //通过教学楼id修改教学楼信息
    @ApiOperation(value = "通过教学楼id修改教学楼信息")
    @PostMapping("/updateBuildingInfo")
    public ResponseResult updateBuildingInfo(@Valid @RequestBody TeachingBuildingDTO teachingBuilding){
        return teachingBuildingService.updateBuildingInfo(teachingBuilding);
    }








}
