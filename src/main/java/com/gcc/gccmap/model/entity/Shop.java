package com.gcc.gccmap.model.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 *
 * @author gjj
 * @since 2023-03-14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Shop implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 店铺id
     */
    private Integer shopId;

    /**
     * 食堂id
     */
    private Integer canteenId;

    /**
     * 店铺名
     */
    private String shopName;

    private String left;

    private String top;


}
