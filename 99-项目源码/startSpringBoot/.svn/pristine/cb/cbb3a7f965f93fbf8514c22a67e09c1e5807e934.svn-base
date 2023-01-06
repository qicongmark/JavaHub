package com.qicong.sboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * User: 祁大聪
 */
@SpringBootTest
public class S16Tests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void testConnection(){
        String sql = "select curdate() from dual";
        String result = jdbcTemplate.queryForObject(sql,String.class);
        System.out.println("result = " + result);
    }
}
