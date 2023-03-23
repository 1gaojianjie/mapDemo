package com.gcc.gccmap.model.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.gcc.gccmap.util.AesTypeHandler;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * 接收前端注册信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeneralUserInfo {
    @Pattern(regexp = "^(?=.{1,20}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*(\\.[A-Za-z]{2,})$",message = "邮箱格式有误")
    private String email;

    @NotBlank(message = "密码不能为空")
    @NotNull(message = "密码不能为空")
    @Length(min = 6,max = 15,message = "密码长度必须大于6小于15")
    @TableField(typeHandler = AesTypeHandler.class)
    private String password;

    @NotBlank(message = "验证码不能为空")
    @NotNull(message = "验证码不能为空")
    @Length(min = 4,max = 4)
    private String emailCode;
}
