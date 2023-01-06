package com.qicong.sboot.s21;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * User: 祁大聪
 */
public class S21Interceptor implements HandlerInterceptor {

    //在请求到Controller之前调用
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("S21Interceptor:: preHandle");
        return true;
//        response.getWriter().write("S21Interceptor return false");
//        return false;//不去请求Controller，直接返回
    }

    //在请求到Controller之后，在渲染页面层之前调用
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("S21Interceptor:: postHandle");
    }

    //请求完成调用
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("S21Interceptor:: afterCompletion");
    }
}
