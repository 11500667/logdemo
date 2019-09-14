package com.home.logdemo.service;

import com.home.logdemo.domain.Log;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.scheduling.annotation.Async;


public interface LogService {

    Long findIp(String date1, String date2);

    /**
     * 新增日志
     * @param joinPoint
     * @param log
     */
    @Async
    void save(ProceedingJoinPoint joinPoint, Log log);
}
