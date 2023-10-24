package com.niceinfoshop.mybatis.Scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.niceinfoshop.mybatis.util.CommonUtils;

import lombok.extern.slf4j.Slf4j;
//import com.niceinfoshop.mybatis.util.CommonUtils;;
@Slf4j
//@EnableScheduling 주석해제해야 작동
@Component
//@Controller
//@Repository
//@Service
public class Scheduler {

	@Autowired
	private CommonUtils util;
	
	@Scheduled(cron = "0/3 * * * * ?")
    public void task1FUNC() {
		String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
		util.logStart(new Scheduler(), methodName);
		
		log.info("task1");
		
		util.logEnd(new Scheduler(), methodName);
	}
	
	@Scheduled(cron = "0/5 * * * * ?")
    public void task2Func() {
		String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
		util.logStart(new Scheduler(), methodName);
		
		log.info("task2");
		
		util.logEnd(new Scheduler(), methodName);
    }
	
	@Scheduled(cron = "0/7 * * * * ?")
    public void task3() {
		String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
		util.logStart(new Scheduler(), methodName);
		
		log.info("task3");
		
		util.logEnd(new Scheduler(), methodName);
    }
}
