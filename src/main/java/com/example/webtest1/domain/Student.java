package com.example.webtest1.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue
    private String id;

    private String name;
    private Integer age;
    private String gender;
}
