package com.demo.beans;

public class MyUsers {
	private String uname;
	private String email;
	private String role;
	public MyUsers() {
		super();
	}
	public MyUsers(String uname, String email, String role) {
		super();
		this.uname = uname;
		this.email = email;
		this.role = role;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
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
	@Override
	public String toString() {
		return "MyUsers [uname=" + uname + ", email=" + email + ", role=" + role + "]";
	}
	

}
