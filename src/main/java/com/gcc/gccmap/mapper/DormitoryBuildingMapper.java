package com.gcc.gccmap.mapper;

import com.gcc.gccmap.model.dto.DormitoryBuildingDTO;
import com.gcc.gccmap.model.entity.DormitoryBuilding;
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
public interface DormitoryBuildingMapper extends BaseMapper<DormitoryBuilding> {

    DormitoryBuildingDTO queryDormitoryBuilding(LocationInfo locationInfo);

    int updateDormitoryInfo(DormitoryBuildingDTO dormitoryBuildingDTO);
}
