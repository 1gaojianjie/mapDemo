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
public class DormitoryBuilding implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer dormitoryBuildingId;

    private String dormitoryBuildingName;

    private Integer dormitoryBuildingHeight;

    private String dormitoryBuildingType;

    private String left;

    private String top;


}
