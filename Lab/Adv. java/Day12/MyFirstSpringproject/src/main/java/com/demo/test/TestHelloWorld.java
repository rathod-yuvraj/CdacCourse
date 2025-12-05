package com.demo.test;

import javax.management.InvalidApplicationException;

import com.demo.beans.Employee;
import com.demo.beans.HelloWorld;

public class TestHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InvalidApplicationException ctx= new ClasspathXmlApplicationContext("springconfig.xml");
		
		HelloWorld hwbean=(HelloWorld) ctx.getBean("hw");
		
		Employee e= new Employee(12,"qwert",23242);
		Employee e= new Employee();
		e.setEid(12);
		e.setEname("qwert");
		e.setSal(23242);
				
		Employee e=(Employee) ctx.getBean("emp1");
		String msg=hwbean.SayHello();
		System.out.println(e);
		
		Employee e1=(Employee) ctx.getBean("emp2");
		System.out.println(e1);
		System.out.println("Message:"+ msg);
		
		MyUser u1=(MyUser)ctx.getBean("u1");
		System.out.println(u1);
		
		((ClassPathXmlApplicationCpntext) ctx).close();
		

	}

}
