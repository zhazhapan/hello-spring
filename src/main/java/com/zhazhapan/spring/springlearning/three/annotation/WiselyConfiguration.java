/**
 * 
 */
package com.zhazhapan.spring.springlearning.three.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.lang.annotation.*;

/**
 * @author pantao
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan
public @interface WiselyConfiguration {
	String[] value() default {};
}
