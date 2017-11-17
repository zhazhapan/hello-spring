/**
 * 
 */
package com.zhazhapan.spring.springlearning.three.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pantao
 *
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
		AwareService awareService = context.getBean(AwareService.class);
		awareService.outputResult();
		context.close();
	}
}
