package com.yuvraj.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import com.yuvraj.beans.*;
import com.yuvraj.dao.EmployeeDao;
import com.yuvraj.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao edao;
	

	public EmployeeServiceImpl() {
		super();
		this.edao = new EmployeeDaoImpl();
	}


	@Override
	public boolean addNewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter Name");
		String nm=sc.next();
		System.out.println("Enter salary");
		double sal=sc.nextDouble();
		System.out.println("Enter Date (dd/mm/yyyy)");
		String dt=sc.next();
		 
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/mm/yyyy"));
		Employee e=new Employee(id,nm,sal,ldt);
		
		return edao.save(e);
	}

}
