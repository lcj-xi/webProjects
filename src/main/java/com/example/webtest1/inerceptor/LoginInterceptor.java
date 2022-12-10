package com.example.webtest1.inerceptor;

import com.example.webtest1.exception.REnum;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest,
                             HttpServletResponse httpServletResponse,
                             Object handle)throws Exception{
        HttpSession session = httpServletRequest.getSession();
        String  code =(String) session.getAttribute(GlobalConst.USER_SESSION_KEY.getMsg());
        if(code==null||code.equals("")){
            httpServletRequest.getRequestDispatcher("/webapi/error").forward(httpServletRequest,httpServletResponse);
            return false;

        }
        return true;

    }
}
