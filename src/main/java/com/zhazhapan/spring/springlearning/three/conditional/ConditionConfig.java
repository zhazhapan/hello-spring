/**
 * 
 */
package com.zhazhapan.spring.springlearning.three.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author pantao
 *
 */
@Configuration
public class ConditionConfig {
	@Bean
	@Conditional(WindowsCondition.class)
	public ListService windowsListService() {
		return new WindowsListServiceImpl();
	}

	@Bean
	@Conditional(LinuxCondition.class)
	public ListService linuxListService() {
		return new LinuxListServiceImpl();
	}
}
