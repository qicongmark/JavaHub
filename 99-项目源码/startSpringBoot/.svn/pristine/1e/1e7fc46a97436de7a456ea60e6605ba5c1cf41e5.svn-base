package com.qicong.sboot.s11;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * User: 祁大聪
 */
@Controller
@RequestMapping("s11")
public class S11Controller {

    //ajax，要求返回json
    @RequestMapping("index")
    @ResponseBody
    public String index(){

        User user = new User();
        user.setName("祁大聪讲编程");
        user.setBirthday(new Date());
        user.setAge(18);
        user.setAddress("Beijing");

        return JsonRender.success(user);
    }

}
