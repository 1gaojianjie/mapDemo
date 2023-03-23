package com.gcc.gccmap.model.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * <p>
 * 
 * </p>
 *
 * @author gjj
 * @since 2023-03-14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class SportsField implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 体育场id
     */

    private Integer sportsFieldId;

    /**
     * 体育场名字
     */
    @NotNull(message = "体育场不能为空")
    private String sportsFieldName;

    /**
     * 所在楼层
     */
    @NotNull(message = "体育场所在楼层不能为空")
    private Integer sportsFieldFloor;

    /**
     * 使用者类型
     */
    @NotNull(message = "体育场使用者类型不能为空")
    private String sportsFieldUsertype;

    /**
     * left坐标
     */
    private Integer left;

    /**
     * top坐标
     */
    private Integer top;


}
