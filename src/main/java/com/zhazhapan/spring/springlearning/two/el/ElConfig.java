/**
 * 
 */
package com.zhazhapan.spring.springlearning.two.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * @author pantao
 *
 */
@Configuration
@ComponentScan("com.zhazhapan.spring.springtest.two.el")
@PropertySource("classpath:com/zhazhapan/spring/springtest/two/el/test.properties")
public class ElConfig {
	@Value("I Love You")
	private String normal;

	@Value("#{systemProperties['os.name']}")
	private String osName;

	@Value("#{T(java.lang.Math).random()*100.0}")
	private double randomNumber;

	@Value("#{elDemoService.another}")
	private String fromAnother;

	@Value("classpath:com/zhazhapan/spring/springtest/two/el/test.properties")
	private Resource testFile;

	@Value("http://www.baidu.com/s?wd=test")
	private Resource testUrl;

	@Value("${book.name}")
	private String bookName;

	@Autowired
	private Environment environment;

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	public void outputResource() {
		try {
			System.out.println(normal);
			System.out.println(osName);
			System.out.println(randomNumber);
			System.out.println(fromAnother);
			System.out.println(IOUtils.toString(testFile.getInputStream()));
			System.out.println(IOUtils.toString(testUrl.getInputStream()));
			System.out.println(bookName);
			System.out.println(environment.getProperty("book.author"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
