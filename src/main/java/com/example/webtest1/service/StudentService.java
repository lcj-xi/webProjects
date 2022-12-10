package com.example.webtest1.service;

import com.example.webtest1.domain.Student;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    List<Student> getAllStu();

    Page<Student> getAll(Pageable pageable);

    Page<Student> getAll(Example<Student> example,Pageable pageable);


    List<Student> getByName(String name);
    Student findById(Integer id);

    Student getByNameAndPassword(String name,String password) throws Exception;


    Student insert(Student student);

    Student update(Student student);

    Student delete(Student student);



}
