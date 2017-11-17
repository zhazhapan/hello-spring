/**
 * 
 */
package com.zhazhapan.spring.springlearning.one.di;

import org.springframework.stereotype.Service;

/**
 * @author pantao
 *
 */
@Service
public class FunctionService {
	public String sayHello(String word) {
		return "Hello " + word + " !";
	}
}
