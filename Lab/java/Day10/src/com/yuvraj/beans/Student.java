package com.yuvraj.beans;

import java.util.Objects;

public class Student {
	private int sid;
	private String sname;
	private int m1;
	public Student(int sid, String sname, int m1) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.m1 = m1;
	}
	public Student() {
		super();
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
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	@Override
	public int hashCode() {
		return Objects.hash(sid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return sid == other.sid;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", m1=" + m1 + "]";
	}
	

}
