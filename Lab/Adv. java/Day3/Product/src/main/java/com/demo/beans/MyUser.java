package com.demo.beans;

public class MyUser {
	
	private int id;
	private String username;
	private String email;
	private String role;

	public int getId() {
		return id;
	}
	
	public MyUser() {
		super();
	}

	
	public MyUser( String username, String email, String role) {
		super();

		this.username = username;
		this.email = email;
		this.role = role;

	}

	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	

}
