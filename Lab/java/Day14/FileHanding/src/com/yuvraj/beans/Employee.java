package com.yuvraj.beans;

import java.time.LocalDate;

public class Employee {
	private int eid;
	private String ename;
	private double sal;
	private LocalDate jdt;
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, double sal, LocalDate jdt) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.jdt = jdt;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public LocalDate getJdt() {
		return jdt;
	}
	public void setJdt(LocalDate jdt) {
		this.jdt = jdt;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", jdt=" + jdt + "]";
	}
	

}
