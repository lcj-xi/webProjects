package com.example.webtest1.webapi;

import com.example.webtest1.domain.Student;
import com.example.webtest1.repository.StudentRepository;
import com.example.webtest1.service.StudentService;
import com.example.webtest1.utils.RUtil;
import com.example.webtest1.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Login {

    @Autowired
    private StudentService studentService;
    @RequestMapping("login")
    public R login(String  name,String password) throws Exception{
        Student student = studentService.getByNameAndPassword(name, password);
        return RUtil.sucess(student);
    }

}
