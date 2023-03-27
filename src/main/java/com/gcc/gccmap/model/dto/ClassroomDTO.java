package com.gcc.gccmap.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 教室id
     */

    private Integer classId;

    /**
     * 教学楼id
     */
    @NotNull(message = "教学楼id不能为空")
    @Min(value = 1, message = "教学楼id不符合规范")
    @Max(value = 100, message = "教学楼id不符合规范")
    private Integer teachingBuildingId;


    /**
     * 教室名（示例：311 - 鸿蒙研究院）
     */
    @NotNull(message = "教室名不能为空")
    private String className;

    /**
     * 所在楼层
     */
    @NotNull(message = "楼层不能为空")
    @Min(value = 1, message = "楼层不符合规范")
    @Max(value = 30, message = "楼层不符合规范")
    private Integer classFloor;

    /**
     * 教室号
     */
    @NotNull(message = "教室号不能为空")
    @Min(value = 1, message = "教室id不符合规范")
    @Max(value = 1000, message = "教室id不符合规范")
    private Integer classFloorid;
}
