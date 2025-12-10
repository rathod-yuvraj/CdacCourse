package com.demo.beans;

public class Employee {
	
	private String pname;
	private String job;
	private double sal;
	private String dept;
	public Employee(String pname, String job, double sal, String dept) {
		super();
		this.pname = pname;
		this.job = job;
		this.sal = sal;
		this.dept = dept;
	}
	public Employee() {
		super();
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [pname=" + pname + ", job=" + job + ", sal=" + sal + ", dept=" + dept + "]";
	}
	
	

}
