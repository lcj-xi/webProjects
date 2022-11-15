package com.example.webtest1.service;

import com.example.webtest1.domain.Student;
import com.example.webtest1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStu(){
        return studentRepository.findAll();
    }

    public List<Student> getByName(String name){
        return studentRepository.findByname(name);
    }

}
