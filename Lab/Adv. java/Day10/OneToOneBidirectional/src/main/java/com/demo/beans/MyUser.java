package com.demo.beans;

public class MyUser {

	public MyUser() {
		super();
	}
	private int id;
	private String name;
	private String Mob;
	private Address addr;
	public MyUser(int id, String name, String mob, Address addr) {
		super();
		this.id = id;
		this.name = name;
		Mob = mob;
		this.addr = addr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMob() {
		return Mob;
	}
	public void setMob(String mob) {
		Mob = mob;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "MyUser [id=" + id + ", name=" + name + ", Mob=" + Mob + "]";
	}
	
	
}
