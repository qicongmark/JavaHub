package com.qicong.sboot.s22;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * User: 祁大聪
 */
@ControllerAdvice
public class S22ExceptionHandler {

    //异常的处理
    @ExceptionHandler(value = Exception.class)
    public Object exceptionHandler(HttpServletRequest request,
                                   HttpServletResponse response,
                                   Exception e) throws Exception{

        ModelAndView mv = new ModelAndView("error/500");
        mv.addObject("message",e);
        mv.addObject("url",request.getRequestURL());
        return mv;
    }

}
