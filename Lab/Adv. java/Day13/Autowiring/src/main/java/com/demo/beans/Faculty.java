package com.demo.beans;

public class Faculty {
	private int fid;
	private String fname;
	private Address addr;
	private Skills spskill;
	public Faculty() {
		super();
	}
	
	public Faculty(int fid, String fname) {
		super();
		this.fid = fid;
		this.fname = fname;
	}

	public Faculty(int fid, String fname, Address addr, Skills spskill) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.addr = addr;
		this.spskill = spskill;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Skills getSpskill() {
		return spskill;
	}
	public void setSpskill(Skills spskill) {
		this.spskill = spskill;
	}
	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fname=" + fname + ", addr=" + addr + ", spskill=" + spskill + "]";
	}
	
	

}
