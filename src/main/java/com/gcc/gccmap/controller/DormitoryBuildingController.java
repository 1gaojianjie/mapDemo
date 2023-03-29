package com.gcc.gccmap.controller;

import com.gcc.gccmap.model.dto.DormitoryBuildingDTO;
import com.gcc.gccmap.model.vo.LocationInfo;
import com.gcc.gccmap.service.DormitoryBuildingService;
import com.gcc.gccmap.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@Api(value = "公寓控制层", tags = { "公寓访问接口" })
public class DormitoryBuildingController {
    @Resource
    private DormitoryBuildingService dormitoryBuildingService;

    //通过坐标查询公寓信息
    @ApiOperation(value = "通过坐标查询公寓信息")
    @GetMapping("/queryDormitoryBuilding")
    public ResponseResult queryDormitoryBuilding(@RequestParam @NotNull String left, @RequestParam @NotNull String top){
        return dormitoryBuildingService.queryDormitoryBuilding(new LocationInfo(Integer.valueOf(left),Integer.valueOf(top)));
    }

    //通过公寓id修改公寓信息
    @ApiOperation(value = "通过公寓id修改公寓信息")
    @PutMapping("/updateDormitoryInfo")
    public ResponseResult updateDormitoryInfo(@Valid @RequestBody DormitoryBuildingDTO dormitoryBuildingDTO){
        return dormitoryBuildingService.updateDormitoryInfo(dormitoryBuildingDTO);
    }
}
