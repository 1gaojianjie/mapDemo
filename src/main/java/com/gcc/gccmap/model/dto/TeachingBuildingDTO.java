package com.gcc.gccmap.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeachingBuildingDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 教学楼id
     */
    @NotNull(message = "教学楼id不能为空")
    @Min(value = 1, message = "教学楼id不符合规范")
    @Max(value = 100, message = "教学楼id不符合规范")
    private Integer teachingBuildingId;

    /**
     * 教学楼名
     */
    @NotNull(message = "教学楼名不能为空")
    @NotBlank(message = "教学楼名不能为空")
    private String teachingBuildingName;

    /**
     * 楼层数
     */
    @NotNull(message = "楼层数不能为空")
    @NotBlank(message = "楼层数不能为空")
    private String teachingBuildingHeight;

}
