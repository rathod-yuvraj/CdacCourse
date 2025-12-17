package com.demo.fullstackproject.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class MyUser {
	private String username;
	private String Password;
	private String role;
	public MyUser() {
		super();
	}
	
	public MyUser(String username, String role) {
		super();
		this.username = username;
		this.role = role;
	}

	public MyUser(String username, String password, String role) {
		super();
		this.username = username;
		Password = password;
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "MyUser [username=" + username + ", Password=" + Password + ", role=" + role + "]";
	}
	
	

}
