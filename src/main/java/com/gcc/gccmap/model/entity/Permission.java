package com.gcc.gccmap.model.entity;

import java.io.Serializable;

/**
 权限
 */
public class Permission implements Serializable {
    private static final long serialVersionUID = -41820710484977489L;
    
    private Integer id;
    
    private String permissionName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

}