/**
 * 
 */
package com.zhazhapan.spring.springlearning.one.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author pantao
 *
 */
@Configuration
@ComponentScan("com.zhazhapan.spring.springtest.one.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
