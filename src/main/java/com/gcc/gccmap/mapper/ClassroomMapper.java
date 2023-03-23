package com.gcc.gccmap.mapper;

import com.gcc.gccmap.model.dto.ClassroomDTO;
import com.gcc.gccmap.model.entity.Classroom;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gcc.gccmap.model.vo.ClassroomDel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author gjj
 * @since 2023-03-14
 */
@Mapper
public interface ClassroomMapper extends BaseMapper<Classroom> {
    List<ClassroomDTO> queryClassroomByBuildingId(Integer buildingId);

    int updateClassByBuildingIdAndClassId(ClassroomDTO classroom);

    int insertClassroom(ClassroomDTO classroom);

    int deleteClassroom(ClassroomDel classroom);

}
