package com.gcc.gccmap.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomDel {
    /**
     * 教室id
     */
    @NotNull(message = "教室id不能为空")
    @Min(value = 1, message = "教室id不符合规范")
    @Max(value = 2000, message = "教室id不符合规范")
    private Integer classId;

    /**
     * 教学楼id
     */
    @Min(value = 1, message = "教学楼id不符合规范")
    @Max(value = 500, message = "教学楼id不符合规范")
    private Integer teachingBuildingId;
}
