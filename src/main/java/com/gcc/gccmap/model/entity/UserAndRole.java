package com.gcc.gccmap.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user_role", autoResultMap = true)
public class UserAndRole {

    private Integer uId;


    private Integer roleId;
}