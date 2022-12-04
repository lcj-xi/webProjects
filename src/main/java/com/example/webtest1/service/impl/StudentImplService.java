package com.example.webtest1.service.impl;

import com.example.webtest1.domain.Student;
import com.example.webtest1.exception.REnum;
import com.example.webtest1.exception.RException;
import com.example.webtest1.repository.StudentRepository;
import com.example.webtest1.service.StudentService;
import com.example.webtest1.utils.RUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImplService implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStu(){
        return studentRepository.findAll();
    }

    @Override
    public Page<Student> getAll(Pageable pageable) {
        return  studentRepository.findAll(pageable);
    }

    public Page<Student> getAll(Example<Student> example,Pageable pageable) {
        return  studentRepository.findAll(example,pageable);
    }
    public List<Student> getByName(String name){
        return studentRepository.findByName(name);
    }

    public Student findById(Integer id){
        return  studentRepository.findById(id).orElse(null);
    }

    public Student getByNameAndPassword(String name,String password) throws Exception{
        Student student = studentRepository.findByNameAndPassword(name, password);
        if(student!=null){
            return student;
        }
        else{
            throw new  RException(REnum.LOGIN_ERROR);
        }
    }


    public Student insert(Student student){
        studentRepository.save(student);
        return student;

    }

    public Student update(Student student){
        studentRepository.save(student);
        return student;
    }

    public Student delete(Student student){
        studentRepository.delete(student);
        return student;
    }



}
