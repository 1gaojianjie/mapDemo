package com.gcc.gccmap.mapper;

import com.gcc.gccmap.model.dto.TeachingBuildingDTO;
import com.gcc.gccmap.model.dto.TeachingBuildingInfoDTO;
import com.gcc.gccmap.model.entity.TeachingBuilding;
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
public interface TeachingBuildingMapper extends BaseMapper<TeachingBuilding> {
    TeachingBuildingDTO queryTeachingBuilding(LocationInfo locationInfo);

    TeachingBuildingInfoDTO queryTeachingBuildingInfo(LocationInfo locationInfo);

    int updateBuildingInfo(TeachingBuildingDTO teachingBuilding);
}
