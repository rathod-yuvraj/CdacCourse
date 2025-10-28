package com.yuvraj.beans;

public class Customer {
	private int cid;
	private String cName;
	private String mob;
	public Customer(int cid, String cName, String mob) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.mob = mob;
	}
	public Customer() {
		super();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cName=" + cName + ", mob=" + mob + "]";
	}
	

}
