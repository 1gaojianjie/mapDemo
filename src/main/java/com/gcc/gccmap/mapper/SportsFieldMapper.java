package com.gcc.gccmap.mapper;

import com.gcc.gccmap.model.dto.SportsFieldDTO;
import com.gcc.gccmap.model.entity.SportsField;
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
public interface SportsFieldMapper extends BaseMapper<SportsField> {
    SportsFieldDTO querySportsFieldInfo(LocationInfo locationInfo);

    int updateSportsFieldInfo(SportsField sportsField);
}
