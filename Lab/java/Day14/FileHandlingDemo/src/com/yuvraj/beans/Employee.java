package com.yuvraj.beans;

import java.time.LocalDate;

public class Employee {
	private int eid;
	private String name;
	private double sal;
	private String Desg;
//	private LocalDate jdt;
	public Employee(int eid, String name,String Desg, double sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
//		this.jdt = jdt;
		this.Desg=Desg;
	}
	public Employee() {
		super();
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
	public String getDesg() {
		return Desg;
	}
	public void setDesg(String desg) {
		Desg = desg;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + ", Desg=" + Desg + "]";
	}
	

}
