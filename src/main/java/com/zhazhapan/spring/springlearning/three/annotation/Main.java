/**
 * 
 */
package com.zhazhapan.spring.springlearning.three.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pantao
 *
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AnnoDemoService demoService = context.getBean(AnnoDemoService.class);
		demoService.outputResult();
		context.close();
	}
}
