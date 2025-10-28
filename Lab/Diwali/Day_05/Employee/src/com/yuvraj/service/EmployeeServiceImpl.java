package com.yuvraj.service;

import java.util.List;
import java.util.Scanner;

import com.yuvraj.beans.Employee;
import com.yuvraj.dao.EmployeeDao;
import com.yuvraj.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao edao;
	

	public EmployeeServiceImpl() {
		 edao=new EmployeeDaoImpl();
	}


	@Override
	public boolean AddNewEmployee() {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name");
		String nm=sc.next();
		System.out.println("Enter Employee ID ");
		int id=sc.nextInt();
		System.out.println("Enter Employee Roles");
		String role=sc.next();
		Employee e=new Employee(nm,id,role);
		return edao.save(e);
	}


	@Override
	public List<Employee> DisplayAll() {
		
		return edao.FindAll();
	}


	@Override
	public boolean RemoveById(int id) {
		
		return edao.DeleteById(id);
	}

}
