package com.yuvraj.beans;

import java.util.Objects;

public class Employee {
	private String empName;
	private int empID;
	
	@Override
	public int hashCode() {
		return Objects.hash(empID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empID == other.empID;
	}


	private String empRole;
	public Employee() {
		super();
	}
	public Employee(int empID) {
		super();
		this.empID = empID;
	}
	public Employee(String empName, int empID, String empRole) {
		super();
		this.empName = empName;
		this.empID = empID;
		this.empRole = empRole;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empID=" + empID + ", empRole=" + empRole + "]";
	}

}
