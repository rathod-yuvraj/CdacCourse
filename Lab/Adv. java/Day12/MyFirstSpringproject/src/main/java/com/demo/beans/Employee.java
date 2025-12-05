package com.demo.beans;

public class Employee {

	private int eid;
	private String ename;
	private Double sal;
	public Employee(int eid, String ename, Double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
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
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(int i) {
		this.sal = i;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
}
