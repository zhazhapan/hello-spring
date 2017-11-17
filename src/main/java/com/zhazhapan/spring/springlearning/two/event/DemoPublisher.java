/**
 * 
 */
package com.zhazhapan.spring.springlearning.two.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author pantao
 *
 */
@Component
public class DemoPublisher {
	@Autowired
	ApplicationContext context;

	public void publish(String msg) {
		context.publishEvent(new DemoEvent(this, msg));
	}
}
