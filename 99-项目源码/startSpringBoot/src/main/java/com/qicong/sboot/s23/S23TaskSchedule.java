package com.qicong.sboot.s23;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * User: 祁大聪
 */
@Component
public class S23TaskSchedule {

//    @Scheduled(fixedRate = 1000) //1000毫秒=1秒
    public void testTask(){
        System.out.println("current time = " + new Date());
    }

//    @Scheduled(cron = "0/2 * * * * 6#4") //第四个星期六执行，每2秒执行一次
    public void testCron(){
        System.out.println("0/2 * * * * 6#4 = " + new Date());
    }

}
