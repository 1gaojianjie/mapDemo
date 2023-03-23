package com.gcc.gccmap.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gcc.gccmap.model.entity.Role;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMapper extends BaseMapper<Role> {
    String queryRoleNameByRID(Integer roleId);
}
