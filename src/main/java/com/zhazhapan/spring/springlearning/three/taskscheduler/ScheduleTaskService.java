/**
 * 
 */
package com.zhazhapan.spring.springlearning.three.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author pantao
 *
 */
@Service
public class ScheduleTaskService {
	private static final SimpleDateFormat DATEFORMAT = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		System.out.println("每隔五秒执行一次 " + DATEFORMAT.format(new Date()));
	}

	@Scheduled(cron = "0 28 11 ? * *")
	public void fixTimeExecution() {
		System.out.println("在指定时间 " + DATEFORMAT.format(new Date()) + "执行");
	}
}
