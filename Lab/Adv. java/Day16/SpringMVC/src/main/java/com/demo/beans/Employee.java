package com.demo.beans;

import java.time.LocalDate;

public class Employee {

	private int empno;
	private String ename;
	private boolean gender;
	private String job;
	private LocalDate hiredate;
	private double sal;
	public Employee() {
		super();
	}
	public Employee(int empno, String ename, boolean gender, String job, LocalDate hiredate, double sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.gender = gender;
		this.job = job;
		this.hiredate = hiredate;
		this.sal = sal;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public LocalDate getHiredate() {
		return hiredate;
	}
	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", gender=" + gender + ", job=" + job + ", hiredate="
				+ hiredate + ", sal=" + sal + "]";
	}
	
	
}
