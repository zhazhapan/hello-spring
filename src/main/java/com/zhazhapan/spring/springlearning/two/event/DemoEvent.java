/**
 * 
 */
package com.zhazhapan.spring.springlearning.two.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author pantao
 *
 */
public class DemoEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -962628790973531058L;
	private String msg;

	public DemoEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
