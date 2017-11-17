/**
 * 
 */
package com.zhazhapan.spring.springlearning.four.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zhazhapan.spring.springlearning.service.DemoService;

/**
 * @author pantao
 *
 */
@RestController
public class MyRestController {
	@Autowired
	DemoService demoService;

	@RequestMapping(value = "/testRest", produces = "text/plain;charset=UTF-8")
	public @ResponseBody String testRest() {
		return demoService.saySomething();
	}
}
