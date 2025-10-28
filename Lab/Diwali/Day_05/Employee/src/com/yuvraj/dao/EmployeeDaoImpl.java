package com.yuvraj.dao;



import java.util.ArrayList;
import java.util.List;

import com.yuvraj.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	
	static List <Employee> elist ;
	
	static {
		 
		 elist =new ArrayList<>();
		 elist.add(new Employee("yuvraj",101,"HR"));
	}
	

	@Override
	public boolean save(Employee e) {
		// TODO Auto-generated method stub
		if(e!=null) {
			return elist.add(e);
			
		}
		return false;
		
	}


	@Override
	public List<Employee> FindAll() {
		
		return elist;
	}


	@Override
	public boolean DeleteById(int id) {
		
		return elist.remove(new Employee(id));
	}

}
