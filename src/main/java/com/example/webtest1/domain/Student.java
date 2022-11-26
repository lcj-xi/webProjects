package com.example.webtest1.domain;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_student")
public class Student {

    //id 学号主键自增。
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //姓名字符型，非空
    private String name;


    //密码；默认为12345
    private String password;

    //年龄 范围（0，150）
    private Integer age;

    //性别：取值为男，女或null
    private String gender;

    //成绩,范围（0，100],可以为null
    private Integer score;
}
