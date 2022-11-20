package com.example.webtest1.service;

import com.example.webtest1.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentServiceTest {
    @Autowired
    private StudentService studentService;
    @Test
    void getAllStu() {
        List<Student> allStu = studentService.getAllStu();
        if(!allStu.isEmpty()){
            for (Student t : allStu) {
                System.out.printf(t.toString());
                System.out.println("\n");
            }
        }
    }

    @Test
    void insert(){
        Student student = new Student();
        student.setId("2020413314");
        student.setName("朱莉");
        Student insert = studentService.insert(student);

    }

}