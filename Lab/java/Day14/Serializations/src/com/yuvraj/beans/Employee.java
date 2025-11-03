package com.yuvraj.beans;

import java.io.Serializable;

public class Employee implements  Serializable{
	private int eid;
	private String ename;
    private String edesg;
    private double sal;
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, String edesg, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edesg = edesg;
		this.sal = sal;
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
	public String getEdesg() {
		return edesg;
	}
	public void setEdesg(String edesg) {
		this.edesg = edesg;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", edesg=" + edesg + ", sal=" + sal + "]";
	}
    
    

}
