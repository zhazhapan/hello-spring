/**
 * 
 */
package com.zhazhapan.spring.springlearning.one.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pantao
 *
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		System.out.println(useFunctionService.sayHello("di"));
		context.close();
	}
}
