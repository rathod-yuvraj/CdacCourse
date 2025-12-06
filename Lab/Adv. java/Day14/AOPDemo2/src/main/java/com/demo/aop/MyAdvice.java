package com.demo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

	@Before("execution (* com.demo.beans.M*.m*(..))")
	public void beforeAdvice() {
		System.out.println("Before Advice");
	}
	@After("execution(* com.demo.beans.M*.m*(..))")
	public void afterAdvice() {
		System.out.println("after Advice");
	}
	
	public Object aroundAdvice() {
		System.out.println("Around Advice");
		return null;
		
	}
}
