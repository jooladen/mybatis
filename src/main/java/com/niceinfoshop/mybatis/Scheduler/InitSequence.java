package com.niceinfoshop.mybatis.Scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.niceinfoshop.mybatis.util.CommonUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableScheduling
@Component
public class InitSequence {
	@Autowired
	private CommonUtils util;
	
	@Scheduled(cron = "0/3 * * * * ?")
    public void initAutoIncrement() {
		String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
		util.logStart(new Scheduler(), methodName);
		
		log.info("initAutoIncrement");
		
		util.logEnd(new Scheduler(), methodName);
	}
}
