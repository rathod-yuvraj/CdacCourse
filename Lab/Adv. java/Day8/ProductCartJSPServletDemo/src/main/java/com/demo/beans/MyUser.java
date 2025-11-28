package com.demo.beans;

public class MyUser {
	private int id;
	private String username;
	private String role;
	private String email;

	public MyUser() {
		super();
	}

	public MyUser(int id, String username, String role, String email) {
		super();
		this.id = id;
		this.username = username;
		this.role = role;
		this.email = email;
	}

	public int getId() {
		return id;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "MyUser [id=" + id + ", username=" + username + ", role=" + role + ", email=" + email + "]";
	}

}
