package com.example.webtest1.webapi;

import com.example.webtest1.domain.Student;
import com.example.webtest1.inerceptor.GlobalConst;
import com.example.webtest1.service.StudentService;
import com.example.webtest1.utils.RUtil;
import com.example.webtest1.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController

@RequestMapping("webapi")
public class Login {

    @Autowired
    private StudentService studentService;
    @RequestMapping("login")
    public R login(String  name, String password , HttpServletRequest httpServletRequest) throws Exception{
        Student student = studentService.getByNameAndPassword(name, password);
        HttpSession session = httpServletRequest.getSession();
        session.setAttribute(GlobalConst.USER_SESSION_KEY.getMsg(), "1");
        session.setMaxInactiveInterval(10);

        return RUtil.sucess(student);
    }

}
