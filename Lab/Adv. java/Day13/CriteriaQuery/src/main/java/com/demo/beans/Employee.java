package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp123")
public class Employee {
	
	@Id
	@GeneratedValue
	private int empid;
	private String empname;
	private LocalDate jdt;
	private double empsal;
	public Employee() {
		super();
	}
	public Employee(int empid, String empname, LocalDate jdt, double empsal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.jdt = jdt;
		this.empsal = empsal;
	}
	public Employee(String empname, LocalDate jdt, double empsal) {
		super();
		this.empname = empname;
		this.jdt = jdt;
		this.empsal = empsal;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public LocalDate getJdt() {
		return jdt;
	}
	public void setJdt(LocalDate jdt) {
		this.jdt = jdt;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", jdt=" + jdt + ", empsal=" + empsal + "]";
	}
	

}
