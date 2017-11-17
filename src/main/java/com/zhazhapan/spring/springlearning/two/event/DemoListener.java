/**
 * 
 */
package com.zhazhapan.spring.springlearning.two.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author pantao
 *
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	@Override
	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMsg();
		System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布人消息：" + msg);
	}
}
