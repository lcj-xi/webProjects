package com.example.webtest1.aspect;

import com.example.webtest1.exception.REnum;
import com.example.webtest1.exception.RException;
import com.example.webtest1.utils.RUtil;
import com.example.webtest1.vo.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    public R handle(Exception e){
        if(e instanceof RException){
            return RUtil.error(((RException) e).getCode(),e.getMessage());

        }
        else {
            return RUtil.error(REnum.UNKNOW_ERROR);
        }
    }
}
