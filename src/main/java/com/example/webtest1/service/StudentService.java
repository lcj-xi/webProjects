package com.example.webtest1.service;

import com.example.webtest1.domain.Student;
import com.example.webtest1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStu(){
        return studentRepository.findAll();
    }

    public List<Student> getByName(String name){
        return studentRepository.findByName(name);
    }

    public Student findById(String id){
        return  studentRepository.findById(id).orElse(null);
    }


    public Student insert(Student student){
        studentRepository.save(student);
        return student;

    }

    public Student delete(Student student){
        studentRepository.delete(student);
        return student;
    }



}
