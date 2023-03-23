package com.gcc.gccmap.service;

import com.gcc.gccmap.model.dto.ShopDTO;
import com.gcc.gccmap.model.vo.ShopDel;
import com.gcc.gccmap.util.ResponseResult;

public interface ShopService {
    ResponseResult updateShopByCanteenIdAndShopId(ShopDTO shop);

    ResponseResult insertShop(ShopDTO shop);

    ResponseResult deleteShop(ShopDel shop);
}
