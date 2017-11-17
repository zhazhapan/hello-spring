/**
 * 
 */
package com.zhazhapan.spring.springlearning.one.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * @author pantao
 *
 */
@Aspect
@Component
public class LogAspect {
	@Pointcut("@annotation(com.zhazhapan.spring.springtest.one.aop.Action)")
	public void annotationPointCut() {
	}

	@After("annotationPointCut()")
	public void after(JoinPoint joinpoint) {
		MethodSignature signature = (MethodSignature) joinpoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("注解式拦截 " + action.name());
	}

	@Before("execution(* com.zhazhapan.spring.springtest.one.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("方法规则式拦截，" + method.getName());
	}
}
