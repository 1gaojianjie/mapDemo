package com.gcc.gccmap.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeachingBuildingInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 教学楼名
     */
    private String teachingBuildingName;

    /**
     * 楼层数
     */
    private String teachingBuildingHeight;

    /**
     * 教室
     */
    private List<ClassroomDTO> classrooms;
}
