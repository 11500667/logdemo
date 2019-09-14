package com.home.logdemo;

import com.home.logdemo.service.LogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LogdemoApplicationTests {

    @Autowired
    LogService logService;

    @Test
    public void contextLoads() {
        System.out.println("=======================");
        System.out.println("============>" + logService.findIp("20190901", "20190914"));

    }

}
