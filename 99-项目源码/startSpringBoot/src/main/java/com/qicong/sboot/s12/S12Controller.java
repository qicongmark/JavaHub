package com.qicong.sboot.s12;

import com.qicong.sboot.s11.JsonRender;
import com.qicong.sboot.s11.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * User: 祁大聪
 */
@Controller
@RequestMapping("s12")
public class S12Controller {

    @RequestMapping("index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("s12");
        User user = new User();
        user.setName("祁大聪讲编程");
        user.setBirthday(new Date());
        user.setAge(18);
        user.setAddress("Beijing");
        mv.addObject("user",user);
        return mv;
    }

}
