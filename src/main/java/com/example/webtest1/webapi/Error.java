package com.example.webtest1.webapi;

import com.example.webtest1.exception.REnum;
import com.example.webtest1.utils.RUtil;
import com.example.webtest1.vo.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("webapi")
public class Error {

    @GetMapping("error")
    public R error(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){


        return RUtil.error(REnum.JUMP);

    }
}
