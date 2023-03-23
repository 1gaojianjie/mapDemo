package com.gcc.gccmap.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface PermissionMapper {
    List<String> queryPermissionByUserId(String userId);

    String queryUserType(String userId);
}
