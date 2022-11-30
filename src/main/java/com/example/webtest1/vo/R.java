package com.example.webtest1.vo;

import lombok.Data;

@Data
public class R<T> {
    //执行结果代码
    private Integer code;
    //提示信息
    private String msg;
    //返回结果
    private T data;
}
