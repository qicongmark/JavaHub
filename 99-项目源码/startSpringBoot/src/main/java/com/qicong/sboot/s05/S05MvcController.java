package com.qicong.sboot.s05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * User: 祁大聪
 */
@Controller
@RequestMapping
public class S05MvcController {

    @RequestMapping
    public ModelAndView index(){
        System.out.println("S05MvcController:: index == ");
        return new ModelAndView("s05.html");
    }

}
