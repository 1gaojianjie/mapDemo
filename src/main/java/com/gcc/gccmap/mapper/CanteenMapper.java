package com.gcc.gccmap.mapper;

import com.gcc.gccmap.model.dto.CanteenDTO;
import com.gcc.gccmap.model.dto.CanteenInfoDTO;
import com.gcc.gccmap.model.entity.Canteen;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gcc.gccmap.model.vo.LocationInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author gjj
 * @since 2023-03-14
 */
@Mapper
public interface CanteenMapper extends BaseMapper<Canteen> {
    CanteenInfoDTO queryCanteenInfo(LocationInfo locationInfo);

    CanteenDTO queryCanteen(LocationInfo locationInfo);

    int updateCanteenInfo(CanteenDTO canteenDTO);
}
