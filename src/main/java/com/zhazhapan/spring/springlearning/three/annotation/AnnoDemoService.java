/**
 * 
 */
package com.zhazhapan.spring.springlearning.three.annotation;

import org.springframework.stereotype.Service;

/**
 * @author pantao
 *
 */
@Service
public class AnnoDemoService {
	public void outputResult() {
		System.out.println("从组合注解配置照样获得的bean");
	}
}
