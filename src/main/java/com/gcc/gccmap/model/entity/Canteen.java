package com.gcc.gccmap.model.entity;

import java.io.Serializable;
import java.util.List;
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
public class Canteen implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer canteenId;

    private String canteenName;

    private List<Shop> shops;

    private Integer left;

    private Integer top;


}
