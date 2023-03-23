package com.gcc.gccmap.controller;

import com.gcc.gccmap.model.dto.CanteenDTO;
import com.gcc.gccmap.model.dto.ShopDTO;
import com.gcc.gccmap.model.vo.LocationInfo;
import com.gcc.gccmap.model.vo.ShopDel;
import com.gcc.gccmap.service.CanteenService;
import com.gcc.gccmap.service.ShopService;
import com.gcc.gccmap.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.validation.Valid;


@RestController
@Api(value = "食堂控制层", tags = { "食堂及商铺访问接口" })
public class CanteenController {
    @Resource
    private CanteenService canteenService;

    @Resource
    private ShopService shopService;

    //查询饭堂所有的店铺
    @ApiOperation(value = "查询饭堂所有的店铺")
    @PostMapping("/queryCanteenInfo")
    public ResponseResult queryCanteenInfo(@Valid @RequestBody LocationInfo locationInfo){
        return canteenService.queryCanteenInfo(locationInfo);
    }

    //通过坐标查询饭堂信息
    @ApiOperation("通过坐标查询饭堂信息")
    @PostMapping("/queryCanteen")
    public ResponseResult queryCanteen(@Valid @RequestBody LocationInfo locationInfo){
        return canteenService.queryCanteen(locationInfo);
    }

    //通过饭堂id和商铺id更新商铺数据
    @ApiOperation(value = "通过饭堂id和商铺id以及数据更新商铺数据")
    @PostMapping("/updateShopByCanteenIdAndShopId")
    public ResponseResult updateShopByCanteenIdAndShopId(@Valid @RequestBody ShopDTO shop){
        return shopService.updateShopByCanteenIdAndShopId(shop);
    }

    //添加新的商铺
    @ApiOperation(value = "添加新的商铺")
    @PostMapping("/insertShop")
    public ResponseResult insertShop(@Valid @RequestBody ShopDTO shop){
        return shopService.insertShop(shop);
    }

    //通过饭堂id和商铺id删除店铺
    @ApiOperation(value = "通过饭堂id和商铺id删除店铺")
    @PostMapping("/deleteShop")
    public ResponseResult deleteShop(@Valid @RequestBody ShopDel shop){
        return shopService.deleteShop(shop);
    }

    //通过饭堂id修改饭堂信息
    @ApiOperation(value = "通过饭堂id修改饭堂信息")
    @PostMapping("/updateCanteenInfo")
    public ResponseResult updateCanteenInfo(@Valid @RequestBody CanteenDTO canteenDTO){
        return canteenService.updateCanteenInfo(canteenDTO);
    }


}
