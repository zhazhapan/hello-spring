/**
 * 
 */
package com.zhazhapan.spring.springlearning.one.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author pantao
 *
 */
@Service
public class UseFunctionService {
	@Autowired
	FunctionService functionService;

	public String sayHello(String word) {
		return functionService.sayHello(word);
	}
}
