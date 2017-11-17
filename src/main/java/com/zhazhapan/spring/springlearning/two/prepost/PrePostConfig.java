/**
 * 
 */
package com.zhazhapan.spring.springlearning.two.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author pantao
 *
 */
@Configuration
@ComponentScan("com.zhazhapan.spring.springtest.two.prepost")
public class PrePostConfig {
        @Bean(initMethod = "init", destroyMethod = "destroy")
        BeanWayService beanWayService() {
                return new BeanWayService();
        }

        @Bean
        Jsr250WayService jsr250WayService() {
                return new Jsr250WayService();
        }
}
