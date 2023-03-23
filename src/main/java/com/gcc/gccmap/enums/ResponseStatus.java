package com.gcc.gccmap.enums;

/**
 * 全局状态码
 */
public enum ResponseStatus {
    //全局状态码
    SUCCESS(600,"操作成功！"),
    FAIL(300,"操作失败"),
    TOKEN_ERROR(301,"非法token"),
    PASSWORD_ERROR(302,"密码错误"),
    USER_NOT_FOUND(303,"用户不存在"),
    USER_NOT_LOGGED(304,"用户未登录"),
    USER_EMAIL_EXIST(305,"邮箱已注册"),
    USER_EMAIL_NOT_EXIST(306,"该邮箱未注册"),
    USER_VCODE_TIMEOUT(307,"请检查账号是否正确或验证码超时"),
    USER_VCODE_ERROR(308,"验证码输入错误"),
    PARM_ERROR(309,"参数异常");


    //操作代码
    int code;
    //提示信息
    String message;
    /**
     * 构造方法
     * @param code
     * @param message
     */
    ResponseStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}