/**
 * 
 */
package com.zhazhapan.spring.springlearning.three.fortest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author pantao
 *
 */
@Configuration
public class TestConfiguration {
	@Bean
	@Profile("dev")
	public TestBean devTestBean() {
		return new TestBean("from development profile");
	}

	@Bean
	@Profile("prod")
	public TestBean prodTestBean() {
		return new TestBean("from production profile");
	}
}
