/**
 * 
 */
package com.zhazhapan.spring.springlearning.three.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * @author pantao
 *
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

	private String beanName;
	private ResourceLoader loader;

	@Override
	public void setResourceLoader(ResourceLoader arg0) {
		this.loader = arg0;
	}

	@Override
	public void setBeanName(String arg0) {
		this.beanName = arg0;
	}

	public void outputResult() {
		System.out.println("Bean的名称为：" + beanName);
		Resource resource = loader
		                .getResource("classpath:com/zhazhapan/spring/springtest/three/aware/test.txt");
		try {
			System.out.println("ResourceLoader加载人文件内容为：" + IOUtils.toString(resource.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
