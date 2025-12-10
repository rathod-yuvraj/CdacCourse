package com.demo.MySpringBootCURD.beans;

public class MyUser {

	private String uname;
	private String Password;
	private String role;
	public MyUser(String uname, String password, String role) {
		super();
		this.uname = uname;
		Password = password;
		this.role = role;
	}
	public MyUser() {
		super();
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
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
		return "MyUser [uname=" + uname + ", Password=" + Password + ", role=" + role + "]";
	}
	
}
