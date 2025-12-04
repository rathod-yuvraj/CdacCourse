package com.demo.beans;

import java.util.Set;
import java.util.HashSet;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dept1234")
public class Department {
	@Id
	private int deptid;
	private String deptname;
	private String deptlocation;
	@OneToMany(mappedBy="department")
	Set<Employee>eset=new HashSet<Employee>();
	
	
	

}
