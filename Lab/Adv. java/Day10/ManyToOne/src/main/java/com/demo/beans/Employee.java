package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Emp12")
public class Employee {
	@Id
	private int empid;
	private  String empName;
	private LocalDate ldt;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="deptid")
	private Department department ;
	public Employee() {
		super();
	}
	public Employee(int empid, String empName, LocalDate ldt, Department department) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.ldt = ldt;
		this.department = department;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public LocalDate getLdt() {
		return ldt;
	}
	public void setLdt(LocalDate ldt) {
		this.ldt = ldt;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", ldt=" + ldt + ", department=" + department
				+ "]";
	}
	
	

	

}
