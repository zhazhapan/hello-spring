/**
 * 
 */
package com.zhazhapan.spring.springlearning.three.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pantao
 *
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
		int nums = 10;
		for (int i = 0; i < nums; i++) {
			asyncTaskService.executeAsyncTask(i);
			asyncTaskService.executeAsyncTaskPlus(i);
		}
		context.close();
	}
}
