package com.gcc.gccmap.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ShopDel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 店铺id
     */
    @NotNull(message = "店铺id不能为空")
    @Min(value = 1, message = "店铺id不符合规范")
    @Max(value = 500, message = "店铺id不符合规范")
    private Integer shopId;

    /**
     * 食堂id
     */
    @NotNull(message = "食堂id不能为空")
    @Min(value = 1, message = "食堂id不符合规范")
    @Max(value = 100, message = "食堂id不符合规范")
    private Integer canteenId;
}
