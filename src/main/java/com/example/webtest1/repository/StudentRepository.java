package com.example.webtest1.repository;

import com.example.webtest1.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,String> {
    public List<Student> findByname(String name);
}
