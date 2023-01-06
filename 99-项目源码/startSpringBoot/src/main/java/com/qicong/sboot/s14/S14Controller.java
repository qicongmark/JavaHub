package com.qicong.sboot.s14;

import com.qicong.sboot.s11.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * User: 祁大聪
 */
@Controller
@RequestMapping("s14")
public class S14Controller {

    @RequestMapping("index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("thymeleaf/s14");
        User user = new User();
        user.setName("祁大聪讲编程");
        user.setBirthday(new Date());
        user.setAge(18);
        user.setAddress("Beijing");
        mv.addObject("user",user);
        return mv;
    }

}
