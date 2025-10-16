package com.yuvraj.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.yuvraj.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
 
	
	static List <Employee> lst;
	static {
		lst=new ArrayList<>();
		lst.add(new Employee(101,"Rohit",23902,LocalDate()));
	}
	

	@Override
	public boolean save(Employee e) {
		// TODO Auto-generated method stub
		
		return false;
	}

}
