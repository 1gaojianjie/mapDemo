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
import javax.validation.constraints.NotNull;

@RestController
@Api(value = "体育场所控制层", tags = { "体育场所访问接口" })
public class SportsFieldController {
    @Resource
    private SportsFieldService sportsFieldService;

    //通过坐标查询体育场所信息
    @ApiOperation(value = "通过坐标查询体育场所信息")
    @GetMapping("/querySportsFieldInfo")
    public ResponseResult querySportsFieldInfo(@RequestParam @NotNull String left, @RequestParam @NotNull String top){
        return sportsFieldService.querySportsFieldInfo(new LocationInfo(Integer.valueOf(left),Integer.valueOf(top)));
    }

    //通过坐标或id更新体育场所信息
    @ApiOperation(value = "通过坐标或id更新体育场所信息")
    @PostMapping("/updateSportsFieldInfo")
    public ResponseResult updateSportsFieldInfo(@Valid @RequestBody SportsField sportsField){
        return sportsFieldService.updateSportsFieldInfo(sportsField);
    }

}
