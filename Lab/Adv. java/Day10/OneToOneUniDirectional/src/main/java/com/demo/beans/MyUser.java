package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="user1234" )
public class MyUser {
	@Id
	private int aid;
	private String name;
	private String mob;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Address2")
	private  Address address;
	
	public MyUser(int aid, String name, String mob, Address address) {
		super();
		this.aid = aid;
		this.name = name;
		this.mob = mob;
		this.address = address;
	}
	public MyUser() {
		super();
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "MyUser [aid=" + aid + ", name=" + name + ", mob=" + mob + ", address=" + address + "]";
	}
	

}
