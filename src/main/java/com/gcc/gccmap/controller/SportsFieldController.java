package com.gcc.gccmap.controller;

import com.gcc.gccmap.model.entity.SportsField;
import com.gcc.gccmap.model.vo.LocationInfo;
import com.gcc.gccmap.service.SportsFieldService;
import com.gcc.gccmap.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@Api(value = "体育场所控制层", tags = { "体育场所访问接口" })
public class SportsFieldController {
    @Resource
    private SportsFieldService sportsFieldService;

    //通过坐标查询体育场所信息
    @ApiOperation(value = "通过坐标查询体育场所信息")
    @GetMapping("/querySportsFieldInfo")
    public ResponseResult querySportsFieldInfo(@Valid @RequestBody LocationInfo locationInfo){
        return sportsFieldService.querySportsFieldInfo(locationInfo);
    }

    //通过坐标或id更新体育场所信息
    @ApiOperation(value = "通过坐标或id更新体育场所信息")
    @PutMapping("/updateSportsFieldInfo")
    public ResponseResult updateSportsFieldInfo(@Valid @RequestBody SportsField sportsField){
        return sportsFieldService.updateSportsFieldInfo(sportsField);
    }

}
