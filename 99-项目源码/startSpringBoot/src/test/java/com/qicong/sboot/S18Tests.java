package com.qicong.sboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * User: 祁大聪
 */
@SpringBootTest
public class S18Tests {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Test
    public void testRedis(){
        String username = redisTemplate.opsForValue().get("username");
        System.out.println("username = " + username);

        redisTemplate.opsForValue().set("englishName","DaCongQI");
    }

}
