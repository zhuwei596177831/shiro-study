package com.zhuweiwei.springbootlearning0405.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author zww
 * @date 2020-05-08 14:02
 * @description
 */
@Component
public class TestSchedule {

    @Scheduled(cron = "0 3/2 * * * ?")
    void testSchedule() {
        System.out.println("111111");
    }

}
