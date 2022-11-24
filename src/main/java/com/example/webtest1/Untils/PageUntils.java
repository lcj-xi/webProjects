package com.example.webtest1.Untils;

import com.example.webtest1.domain.Student;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data

public class PageUntils implements Serializable {
    private int total;
    private List<?> rows;


    public PageUntils (List<?> list,Long total){
        this.rows=list;
        this.total=total.intValue();
    }

    public PageUntils (List<?> list,int total){
        this.rows=list;
        this.total=total;
    }

}
