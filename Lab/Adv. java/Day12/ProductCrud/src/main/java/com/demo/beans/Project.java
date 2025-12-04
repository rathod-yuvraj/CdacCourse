package com.demo.beans;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="Project")
public class Project {
     @Id
	private int id;
	private String pname;
	private LocalDate startdate;
	@ManyToMany(mappedBy ="pset")
	Set<Employee>eset;
	
	public Project(int id, String pname, LocalDate startdate) {
		super();
		this.id = id;
		this.pname = pname;
		this.startdate = startdate;
	}
	public Project() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public LocalDate getStartdate() {
		return startdate;
	}
	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", pname=" + pname + ", startdate=" + startdate + "]";
	} 
	
	
}
