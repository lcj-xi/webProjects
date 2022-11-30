package com.example.webtest1.utils;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data

public class PageUtils implements Serializable {
    private int total;
    private List<?> rows;


    public PageUtils(List<?> list, Long total){
        this.rows=list;
        this.total=total.intValue();
    }

    public PageUtils(List<?> list, int total){
        this.rows=list;
        this.total=total;
    }

}
