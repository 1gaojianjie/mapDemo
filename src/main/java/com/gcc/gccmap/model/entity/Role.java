package com.gcc.gccmap.model.entity;

import java.io.Serializable;

/**
 角色
 */
public class Role implements Serializable {
    private static final long serialVersionUID = 969445487832965915L;
    
    private Integer roleId;
    
    private String roleName;


    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}