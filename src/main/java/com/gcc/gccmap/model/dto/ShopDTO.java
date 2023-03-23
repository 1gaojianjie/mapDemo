package com.gcc.gccmap.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ShopDTO implements Serializable {

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

    /**
     * 店铺名
     */
    @NotNull(message = "店铺名不能为空")
    @NotBlank(message = "店铺名不能为空")
    private String shopName;
}
