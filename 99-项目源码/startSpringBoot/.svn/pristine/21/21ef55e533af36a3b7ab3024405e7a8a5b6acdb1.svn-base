package com.qicong.sboot;

import com.qicong.sboot.s17.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * User: 祁大聪
 */
@SpringBootTest
public class S17StudentTests {

    @Autowired
    private StudentService studentService;

    @Test
    void testConnection(){
        String result = studentService.getCurDate();
        System.out.println("result = " + result);
    }
}
