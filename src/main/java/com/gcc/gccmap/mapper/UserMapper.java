package com.gcc.gccmap.mapper;

import com.gcc.gccmap.model.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gcc.gccmap.model.vo.ShowUserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author gjj
 * @since 2023-03-14
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    int updateUser(ShowUserInfo userInfo);

}
