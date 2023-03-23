package com.gcc.gccmap.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class SportsFieldDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 体育场id
     */
    private Integer sportsFieldId;

    /**
     * 体育场名字
     */
    private String sportsFieldName;

    /**
     * 所在楼层
     */
    private Integer sportsFieldFloor;

    /**
     * 使用者类型
     */
    private String sportsFieldUsertype;

}
