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
public class Classroom implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 教室id
     */
    private Integer classId;

    /**
     * 教学楼id
     */
    private Integer teachingBuildingId;

    /**
     * 教室名（示例：311 - 鸿蒙研究院）
     */
    private String className;

    /**
     * 所在楼层
     */
    private Integer classFloor;

    /**
     * 教室号
     */
    private Integer classFloorid;


}
