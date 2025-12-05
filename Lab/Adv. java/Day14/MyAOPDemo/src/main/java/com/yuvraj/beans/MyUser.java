package com.yuvraj.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyUser {
	
	@Value("yuvraj")
	private String name;
	

	public MyUser() {
		super();
	}


	public MyUser(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
public void m1() {
	System.out.println("this are m1 method");
}
public int m2(int m2) {
	int m4=m2;
	System.out.println("this is are m2 setter value "+m4);
	System.out.println("this are m1 method");
	return m4;
}
	@Override
	public String toString() {
		System.out.println("toString Method ");
		return "MyUser [name=" + name + "]";
	}
	

	
}
