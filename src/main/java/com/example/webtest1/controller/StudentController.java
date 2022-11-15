package com.example.webtest1.controller;

import com.example.webtest1.domain.Student;
import com.example.webtest1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("student/list")
    public String list(Model model){
        List<Student> allStu = studentService.getAllStu();

        model.addAttribute("data",allStu);
        return "student/list";
    }
}
