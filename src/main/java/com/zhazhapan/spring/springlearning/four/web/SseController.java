/**
 * 
 */
package com.zhazhapan.spring.springlearning.four.web;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author pantao
 *
 */
@Controller
public class SseController {

	@RequestMapping(value = "/push", produces = "text/event-stream")
	public @ResponseBody String push() {
		Random random = new Random();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "data:Testing " + random.nextInt() + "\n\n";
	}
}
