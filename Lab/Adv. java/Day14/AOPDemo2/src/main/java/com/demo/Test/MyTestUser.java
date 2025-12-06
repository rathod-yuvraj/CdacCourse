package com.demo.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.MyUser;

public class MyTestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConfig.xml");
          MyUser u1= (MyUser) ctx.getBean("myUser");
          System.out.println(u1);
          
          
	}

}
