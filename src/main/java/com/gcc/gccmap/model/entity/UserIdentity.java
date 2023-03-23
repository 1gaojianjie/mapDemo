package com.gcc.gccmap.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class UserIdentity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户身份信息id
     */
    @TableId(value = "user_identity_id", type = IdType.AUTO)
    private Integer userIdentityId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 性别
     */
    private String userSex;

    /**
     * 用户真实姓名
     */
    private String userRealname;

    /**
     * 学校
     */
    private String userSchool;

    /**
     * 学院
     */
    private String userCollege;

    /**
     * 专业
     */
    private String userSpecialty;

    /**
     * 学号
     */
    private Integer userStudentId;

    /**
     * 班级
     */
    private String userClass;


}
