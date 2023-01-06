package com.qicong.sboot.s17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: 祁大聪
 */
@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;

    public String getCurDate(){
        return studentDao.getCurDate();
    }

    public List<Student> getStudents(){
        return studentDao.getStudents();
    }

}
