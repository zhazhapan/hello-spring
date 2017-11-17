/**
 * 
 */
package com.zhazhapan.spring.springlearning.three.fortest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author pantao
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestConfiguration.class })
@ActiveProfiles("prod")
public class DemoBeanIntegrationTest {
	@Autowired
	private TestBean testBean;

	@Test
	public void prodBeanShouldInject() {
		String expected = "from production profile";
		String actual = testBean.getContent();
		Assert.assertEquals(expected, actual);
	}
}
