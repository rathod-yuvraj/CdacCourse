package com.demo.test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Faculty;

public class TestAutowiring {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		Faculty f=(Faculty) ctx.getBean("f2");
		
		System.out.println(f);
		
		
		((ClassPathXmlApplicationContext) ctx).close();
	
	}

}
