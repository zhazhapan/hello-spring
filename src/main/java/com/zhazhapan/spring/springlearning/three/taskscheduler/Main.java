/**
 * 
 */
package com.zhazhapan.spring.springlearning.three.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pantao
 *
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
		                TaskScheduleConfig.class);
		context.close();
	}
}
