package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;

public class EmployeeServiceImpl implements  EmployeeService {

	
	private EmployeeDao edao;
	public EmployeeServiceImpl(EmployeeDao edao) {
		super();
		this.edao = edao;
	}
	
	@Override
	public boolean addProjectToEmployee(int eid, int pid) {
		
		
		
		
		return false;
	}
	
	
	
	@Override
	public boolean updateEmployeeById(int empid, String name, double sal) {
		
		return false;
	}
	
	@Override
	public boolean addNewEmployee() {
		// TODO Auto-gen
		Scanner sc = new Scanner (System.in);
		System.out.println("ENter the id of EMPLIOYEEE");
		int eid = sc.nextInt();
		System.out.println("ENTER THE EMPLOYEE NAME");
		String name = sc.next();
		System.out.println("ENTR THE HIREDATE dd/MM/yyyy");
		String dt = sc.next();
		LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("ENTER THE SALARY");
		Double sal = sc.nextDouble();
		System.out.println("ENTER THE PROJECT ID");
		int pid = sc.nextInt();
		//String[] parr=pid.split(",");
		//Set<Project> pset=pdao.findByPid(parr);
		Employee e = new Employee (eid,name,ldt,sal);
		
		
				
		
		return edao.save(e);
	}
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean deletebyId(int empid) {
		// TODO Auto-generated method stub
		return false;
	}
	

	@Override
	public void closeMySessionFactory() {
		
		
	}

}
