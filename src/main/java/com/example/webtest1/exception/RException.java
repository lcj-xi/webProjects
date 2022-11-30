package com.example.webtest1.exception;

public class RException  extends RuntimeException{

    private Integer code;

    public RException(Integer code,String  msg){
        super(msg);
        this.code=code;
    }
    public RException(REnum rEnum){
        super(rEnum.getMsg());
        this.code=rEnum.getCode();

    }

    public Integer getCode() {
        return code;
    }
}
