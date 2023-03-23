package com.gcc.gccmap.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gcc.gccmap.model.entity.UserAndRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserAndRoleMapper extends BaseMapper<UserAndRole> {
    Integer queryRoleIdByUID(Integer userId);
}
