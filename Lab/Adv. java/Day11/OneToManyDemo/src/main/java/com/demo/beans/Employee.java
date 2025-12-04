package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="emp123")
public class Employee {
	@Id
	private int empid;
	private String empname;
	private LocalDate ldt;
	private Double sal;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="deptid")
  private	Department dept;
public Employee() {
	super();
}
public Employee(int empid, String empname, LocalDate ldt, Double sal, Department dept) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.ldt = ldt;
	this.sal = sal;
	this.dept = dept;
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
public LocalDate getLdt() {
	return ldt;
}
public void setLdt(LocalDate ldt) {
	this.ldt = ldt;
}
public Double getSal() {
	return sal;
}
public void setSal(Double sal) {
	this.sal = sal;
}
public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", empname=" + empname + ", ldt=" + ldt + ", sal=" + sal + ", dept=" + dept
			+ "]";
}
  

}
