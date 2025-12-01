package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user12")
public class MyUser {

	@Id
	private int id;
	private String name;
	private String Mob;
	
	@OneToOne(fetch=FetchType.LAZY) //fetch lazy will avoid join query
	@JoinColumn(name="addrid") 
	private Address addr;
	public MyUser() {
		super();
	}
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
