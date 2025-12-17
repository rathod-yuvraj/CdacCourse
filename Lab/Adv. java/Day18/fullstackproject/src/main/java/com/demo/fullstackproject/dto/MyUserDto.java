package com.demo.fullstackproject.dto;

public class MyUserDto {

	private String username;
	private String role;
	
	public MyUserDto() {
		super();
	}
	public MyUserDto(String username, String role) {
		super();
		this.username = username;
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "MyUserDto [username=" + username + ", role=" + role + "]";
	}
	
	
}
