package com.qicong.sboot.s17;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * User: 祁大聪
 */
@Mapper
public interface StudentDao {

    public String getCurDate();

    public List<Student> getStudents();

}
