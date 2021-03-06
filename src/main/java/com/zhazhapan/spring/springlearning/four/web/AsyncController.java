/**
 * 
 */
package com.zhazhapan.spring.springlearning.four.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

import com.zhazhapan.spring.springlearning.service.PushService;

/**
 * @author pantao
 *
 */
@Controller
public class AsyncController {
	@Autowired
	PushService pushService;

	@RequestMapping("/defer")
	@ResponseBody
	public DeferredResult<String> deferredCall() {
		// 返回给客户端DeferredResult
		return pushService.getAsyncUpdate();
	}
}
