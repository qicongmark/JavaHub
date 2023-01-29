package com.qicong.sboot.s25;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("s25")
public class PrettifyController {

    @RequestMapping("index")
    public ModelAndView index(){
        return new ModelAndView("/s25/index.html");
    }
}
