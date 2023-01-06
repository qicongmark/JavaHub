package com.qicong.sboot.s19;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * User: 祁大聪
 */
@Controller
@RequestMapping("s19")
public class S19LoginController {

    @RequestMapping("login")
    public ModelAndView login(){
        return new ModelAndView("s19-login");
    }

    @RequestMapping("dologin")
    @ResponseBody
    public String dologin(String username, String password){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try{
            subject.login(token);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "failure";
        }
    }

    @RequestMapping("logout")
    public ModelAndView logout(){
        SecurityUtils.getSubject().logout();
        return new ModelAndView("redirect:s19/login");
    }

}
