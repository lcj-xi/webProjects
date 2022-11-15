package com.example.webtest1.webapi;

import com.example.webtest1.domain.Student;
import com.example.webtest1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("webapi/student")
public class StudentRestController {

    @Autowired
    StudentService studentService;

    /**
     * url:https://localhost:8080/webapi/student/list
     * @return List<Student>
     */
    @GetMapping("list")
    public List<Student> getAll(){
        return studentService.getAllStu();
    }

    @GetMapping("findbyname")
    public List<Student> findByname(@RequestParam("name") String sname){

        List<Student> byName = studentService.getByName(sname);
        return byName;
    }

}
