package com.gcc.gccmap.controller;

import com.gcc.gccmap.model.dto.DormitoryBuildingDTO;
import com.gcc.gccmap.model.vo.LocationInfo;
import com.gcc.gccmap.service.DormitoryBuildingService;
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
@Api(value = "公寓控制层", tags = { "公寓访问接口" })
public class DormitoryBuildingController {
    @Resource
    private DormitoryBuildingService dormitoryBuildingService;

    //通过坐标查询公寓信息
    @ApiOperation(value = "通过坐标查询公寓信息")
    @PostMapping("/queryDormitoryBuilding")
    public ResponseResult queryDormitoryBuilding(@Valid @RequestBody LocationInfo locationInfo){
        return dormitoryBuildingService.queryDormitoryBuilding(locationInfo);
    }

    //通过公寓id修改公寓信息
    @ApiOperation(value = "通过公寓id修改公寓信息")
    @PostMapping("/updateDormitoryInfo")
    public ResponseResult updateDormitoryInfo(@Valid @RequestBody DormitoryBuildingDTO dormitoryBuildingDTO){
        return dormitoryBuildingService.updateDormitoryInfo(dormitoryBuildingDTO);
    }
}
