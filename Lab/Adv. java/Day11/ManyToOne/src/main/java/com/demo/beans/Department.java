package com.demo.beans;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Dept123")
public class Department {
	@Id
	private int deptid;
	private String name;
	
	private String dloc;
	@OneToMany(mappedBy="dept")
	Set<Employee> eset;
	public Department() {
		super();
	}
	
	public Department(int deptid, String name, String dloc) {
		super();
		this.deptid = deptid;
		this.name = name;
		this.dloc = dloc;
	}

	public Department(int deptid, String name, String dloc, Set<Employee> eset) {
		super();
		this.deptid = deptid;
		this.name = name;
		this.dloc = dloc;
		this.eset = eset;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDloc() {
		return dloc;
	}
	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
	public Set<Employee> getEset() {
		return eset;
	}
	public void setEset(Set<Employee> eset) {
		this.eset = eset;
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", name=" + name + ", dloc=" + dloc + ", eset=" + eset + "]";
	}
	

}
