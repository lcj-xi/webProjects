package com.example.webtest1.repository;

import com.example.webtest1.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    public List<Student> findByName(String name);

    Student  findByNameAndPassword(String name,String password);




}
