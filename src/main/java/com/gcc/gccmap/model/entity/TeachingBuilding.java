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
public class TeachingBuilding implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 教学楼id
     */
    private Integer teachingBuildingId;

    /**
     * 教学楼名
     */
    private String teachingBuildingName;

    /**
     * 楼层数
     */
    private String teachingBuildingHeight;

    /**
     * left坐标
     */
    private Integer left;

    /**
     * top坐标
     */
    private Integer top;


}
