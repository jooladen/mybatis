package com.niceinfoshop.mybatis.util;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class CommonUtils {

	public String getClassName(Object obj) {
        Class<?> clazz = obj.getClass();
        return clazz.getName();
    }
//	private  String getClassName() {
//		Class<?> clazz = null;
//		try {
//			clazz = Class.forName(this.getClass().getName());
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//		return clazz.getName();
//	}
	
//	private static String getClassName() {
//	    Class<?> clazz = null;
//	    try {
//	        clazz = Class.forName(Thread.currentThread().getStackTrace()[1].getClassName());
//	    } catch (ClassNotFoundException e) {
//	        e.printStackTrace();
//	    }
//	    return clazz.getName();
//	}
	
	
	
	public  void logStart(Object obj, String methodName) {	
		log.info("--------------------------------------------------------------------------------");
		log.info("Start : " + getClassName(obj) + "." + methodName);
	}
	
	public  void logEnd(Object obj, String methodName) {	
		log.info("End : " + getClassName(obj) +"." + methodName);
		log.info("--------------------------------------------------------------------------------");
    }
}
