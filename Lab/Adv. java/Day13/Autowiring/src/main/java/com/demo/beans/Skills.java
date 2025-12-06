package com.demo.beans;

public class Skills {
	private int sid;
	private String sname;
	private int exp;
	public Skills() {
		super();
	}
	public Skills(int sid, String sname, int exp) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.exp = exp;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Skills [sid=" + sid + ", sname=" + sname + ", exp=" + exp + "]";
	}
	
	
	

}
