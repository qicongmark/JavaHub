package com.qicong.sboot.s13;

import com.qicong.sboot.s11.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * User: 祁大聪
 */
@Controller
@RequestMapping("s13")
public class S13Controller {

    @RequestMapping("index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("s13");
        User user = new User();
        user.setName("祁大聪讲编程");
        mv.addObject("user",user);

        String school = "清华";
        mv.addObject("school",school);

        List<User> userList = new ArrayList<User>();
        Map<String, User> userMap = new HashMap<String, User>();
        for(int i = 0; i < 10; i++){
            User tmpUser = new User();
            tmpUser.setName("祁大聪讲编程 - " + i);
            userList.add(tmpUser);

            userMap.put("user-"+i, tmpUser);
        }
        mv.addObject("userList",userList);
        mv.addObject("userMap",userMap);

        return mv;
    }

}
