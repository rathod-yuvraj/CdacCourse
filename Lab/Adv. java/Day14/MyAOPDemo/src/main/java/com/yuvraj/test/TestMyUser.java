package com.yuvraj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yuvraj.beans.MyUser;

public class TestMyUser {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
	 MyUser u1=(MyUser) ctx.getBean("myUser");
	 System.out.println(u1);
	 u1.m1();
	 int ans=u1.m2(100);
	System.out.println(ans);
	System.out.println("getter method "+u1.getName());
	
	
	}

}
