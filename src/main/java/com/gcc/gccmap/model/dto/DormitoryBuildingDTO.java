package com.gcc.gccmap.model.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

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
public class DormitoryBuildingDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "公寓id不能为空")
    @Min(value = 1, message = "公寓id不符合规范")
    @Max(value = 300, message = "公寓id不符合规范")
    private Integer dormitoryBuildingId;

    @NotNull(message = "公寓名不能为空")
    @NotBlank(message = "公寓名不能为空")
    private String dormitoryBuildingName;

    @NotNull(message = "公寓楼层数不能为空")
    @Min(value = 1, message = "楼层不符合规范")
    @Max(value = 30, message = "楼层不符合规范")
    private Integer dormitoryBuildingHeight;

    @NotNull(message = "公寓类型不能为空")
    @NotBlank(message = "公寓类型不能为空")
    private String dormitoryBuildingType;


}
