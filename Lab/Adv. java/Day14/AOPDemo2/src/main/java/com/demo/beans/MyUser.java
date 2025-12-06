package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyUser {

	@Value("Rohit")
	private String name;

	public MyUser(String name) {
		super();
		this.name = name;
	}

	public MyUser() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyUser [name=" + name + "]";
	}
	

	
}
