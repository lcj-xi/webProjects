package com.example.webtest1.controller;

import com.example.webtest1.domain.Student;
import com.example.webtest1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/show")
public class Demo {
    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/getAllStu")
    public List<Student> AllStuJson(){
        return studentRepository.findAll();
    }

}
