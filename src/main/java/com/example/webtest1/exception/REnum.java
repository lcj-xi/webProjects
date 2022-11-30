package com.example.webtest1.exception;


/**
 * 关于异常的枚举类
 */
public enum REnum {
    UNKNOW_ERROR(-999, "未知错误！"),
    COMMON_ERROR(-10, "一般性错误！"),
    LOGIN_ERROR(-2, "登录出错，不正确的密码或用户！"),
    SUCESS(0, "成功！");



    private Integer code;
    private String msg;

    REnum(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
