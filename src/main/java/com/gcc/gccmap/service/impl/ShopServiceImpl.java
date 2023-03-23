package com.gcc.gccmap.service.impl;

import com.gcc.gccmap.mapper.ShopMapper;
import com.gcc.gccmap.enums.ResponseStatus;
import com.gcc.gccmap.model.dto.ShopDTO;
import com.gcc.gccmap.model.entity.Shop;
import com.gcc.gccmap.model.vo.ShopDel;
import com.gcc.gccmap.service.ShopService;
import com.gcc.gccmap.util.ResponseResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class ShopServiceImpl implements ShopService {
    @Resource
    private ShopMapper shopMapper;

    @Transactional
    @Override
    public ResponseResult updateShopByCanteenIdAndShopId(ShopDTO shop) {
        if(shopMapper.updateShopByCanteenIdAndShopId(shop)==1)
            return new ResponseResult(ResponseStatus.SUCCESS.getCode(), "更新商铺信息成功");
        return new ResponseResult(ResponseStatus.FAIL.getCode(), "更新商铺信息失败");
    }

    @Transactional
    @Override
    public ResponseResult insertShop(ShopDTO shop) {
        Shop shopInfo = new Shop();
        BeanUtils.copyProperties(shop,shopInfo);
        if(shopMapper.insertShop(shopInfo)==1)
            return new ResponseResult(ResponseStatus.SUCCESS.getCode(), "增加商铺信息成功");
        return new ResponseResult(ResponseStatus.FAIL.getCode(), "增加商铺信息失败");
    }

    @Transactional
    @Override
    public ResponseResult deleteShop(ShopDel shop) {
        if(shopMapper.deleteShop(shop)==1)
            return new ResponseResult(ResponseStatus.SUCCESS.getCode(), "删除商铺信息成功");
        return new ResponseResult(ResponseStatus.FAIL.getCode(), "删除商铺信息失败");
    }
}
