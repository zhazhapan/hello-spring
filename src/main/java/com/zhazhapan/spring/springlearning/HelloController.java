/**
 * 
 */
package com.zhazhapan.spring.springlearning;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author pantao
 *
 */
@Controller
public class HelloController {

	@RequestMapping("/index")
	public String hello() {
		System.out.println("spring working");
		return "index";
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public @ResponseBody String upload(MultipartFile file) {
		try {
			FileUtils.writeByteArrayToFile(new File("/Users/pantao/Desktop/upload/" + file.getOriginalFilename()),
					file.getBytes());
			return "ok";
		} catch (IOException e) {
			e.printStackTrace();
			return "wrong";
		}
	}
}
