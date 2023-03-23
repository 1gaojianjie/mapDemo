package com.gcc.gccmap.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gcc.gccmap.util.AesTypeHandler;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author gjj
 * @since 2023-03-14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName(value = "user", autoResultMap = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    @TableField(typeHandler = AesTypeHandler.class)
    private String password;

    /**
     * 手机号
     */
    private String phoneNum;

    /**
     * 电子邮箱
     */
    @TableField("Email")
    private String email;

    /**
     * 头像路径
     */
    private String profilePhotoPath;

    /**
     * 最后一次离线时间
     */
    @TableField("Last_offline_time")
    private LocalDateTime lastOfflineTime;

    /**
     * 用户组
     */
    private String userGroup;

    /**
     * 状态码
     */
    private Boolean stateCode;

    public User(String email,String password) {
        this.password = password;
        this.email = email;
    }
}
