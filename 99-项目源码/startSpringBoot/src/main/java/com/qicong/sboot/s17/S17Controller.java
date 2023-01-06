package com.qicong.sboot.s17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * User: 祁大聪
 */
@Controller
@RequestMapping("s17")
public class S17Controller {

    @Autowired
    private StudentService studentService;

    @RequestMapping("index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("s17");
        List<Student> studentList =  studentService.getStudents();
        mv.addObject("studentList",studentList);
        return mv;
    }
}
