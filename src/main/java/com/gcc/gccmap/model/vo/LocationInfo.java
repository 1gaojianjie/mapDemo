package com.gcc.gccmap.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 建筑坐标信息
 * */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocationInfo {
    @NotNull(message = "坐标信息不能为空")
    @Min(value = 1, message = "坐标信息不符合规范")
    @Max(value = 10000, message = "坐标信息不符合规范")
    private Integer left;

    @NotNull(message = "坐标信息不能为空")
    @Min(value = 1, message = "坐标信息不符合规范")
    @Max(value = 10000, message = "坐标信息不符合规范")
    private Integer top;
}
