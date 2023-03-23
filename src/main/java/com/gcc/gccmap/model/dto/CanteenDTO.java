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
public class CanteenDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 饭堂id
     */
    @NotNull(message = "食堂id不能为空")
    @Min(value = 1, message = "食堂id不符合规范")
    @Max(value = 100, message = "食堂id不符合规范")
    private Integer canteenId;

    /**
     * 教学楼名字
     */
    @NotNull(message = "教学楼名字不能为空")
    private String canteenName;
}
