/**
 * 
 */
package com.zhazhapan.spring.springlearning.one.aop;

import org.springframework.stereotype.Service;

/**
 * @author pantao
 *
 */
@Service
public class DemoAnnotationService {
	@Action(name = "注解式拦截的add操作")
	public void add() {
		System.out.println("starting DemoAnnotationService");
	}
}
