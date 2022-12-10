package com.example.webtest1.inerceptor;

public enum GlobalConst {
    USER_SESSION_KEY("user"),
    ADMIN_SESSION_KEY("admin");

    private String msg;
    GlobalConst(String msg){
        this.msg=msg;
    }


    public String getMsg(){
        return msg;
    }

}
