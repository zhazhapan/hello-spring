/**
 * 
 */
package com.zhazhapan.spring.springlearning.three.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pantao
 *
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
		                ConditionConfig.class);
		ListService listService = context.getBean(ListService.class);
		System.err.println(context.getEnvironment().getProperty("os.name") + "系统下的列表命令为："
		                + listService.showListCmd());
		context.close();
	}
}
