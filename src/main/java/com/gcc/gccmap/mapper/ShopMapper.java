package com.gcc.gccmap.mapper;

import com.gcc.gccmap.model.dto.ShopDTO;
import com.gcc.gccmap.model.entity.Shop;
import com.gcc.gccmap.model.vo.ShopDel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author gjj
 * @since 2023-03-14
 */
@Mapper
public interface ShopMapper{
    List<Shop> queryShopsByCanteenId(Integer canteenId);

    int updateShopByCanteenIdAndShopId(ShopDTO shop);

    int insertShop(Shop shop);

    int deleteShop(ShopDel shop);
}
