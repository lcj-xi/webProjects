package com.example.webtest1.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class HttpAspect {

    //切入点，com.example.webtest1.webapi包中StudentRestController的所有方法
    @Pointcut("execution(* com.example.webtest1.webapi.StudentRestController.*(..))")
    public void log(){
    }

    //所切入方法执行前所执行的代码
    @Before("log()")
    public void doBefore(){
        System.out.println("do before!");

    }

    //所切入方法执行后所执行的代码

    @AfterReturning(returning = "returnObj",pointcut = "log()")
    public void afterReturning(Object returnObj){
        log.info("response{}",returnObj);

    }

    //所切入方法执行后所执行的代码

    @After("log()")
    public void after(){
        System.out.println("do after!");
    }
}
