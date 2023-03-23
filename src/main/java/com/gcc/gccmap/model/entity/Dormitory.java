package com.gcc.gccmap.model.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
public class Dormitory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 宿舍id
     */
    private Integer dormitoryId;

    /**
     * 宿舍楼id
     */
    private Integer dormitoryBuildingId;

    /**
     * 宿舍名（号）
     */
    private String dormitoryName;


}
