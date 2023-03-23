package com.gcc.gccmap.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShowUserInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 用户id
     */
    private Integer userId; //测试问题

    /**
     * 用户真实姓名
     */
    @NotBlank(message = "姓名不能为空")
    @NotNull(message = "姓名不能为空")
    private String userRealname;

    /**
     * 性别
     */
    @NotBlank(message = "性别不能为空")
    @NotNull(message = "性别不能为空")
    private String userSex;

    /**
     * 用户名
     */
    @NotBlank(message = "姓名不能为空")
    @NotNull(message = "姓名不能为空")
    private String userName;

    /**
     * 手机号
     */
    private String phoneNum;

    /**
     * 学号
     */
    private Integer userStudentId;


    /**
     * 班级
     */
    private String userClass;

    /**
     * 专业
     */
    private String userSpecialty;

    /**
     * 学院
     */
    private String userCollege;



    /**
     * 学校
     */
    private String userSchool;

    /**
     * 电子邮箱
     */
    @Pattern(regexp = "^(?=.{1,20}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*(\\.[A-Za-z]{2,})$",message = "邮箱格式有误")
    private String email;



}
