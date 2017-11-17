/**
 * 
 */
package com.zhazhapan.spring.springlearning.two.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author pantao
 *
 */
@Service
public class ElDemoService {
	@Value("其他类的属性")
	private String another;

	public String getAnother() {
		return another;
	}

	public void setAnother(String another) {
		this.another = another;
	}
}
