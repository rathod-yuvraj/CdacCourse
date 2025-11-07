package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
   private EmployeeDao edao;

public EmployeeServiceImpl() {
	super();
	this.edao = new EmployeeDaoImpl();
}

@Override
public void readFile(String fname) {
	edao.readData(fname);
	
}

@Override
public boolean addNewEmployee() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id");
	int empid=sc.nextInt();
	System.out.println("Enter name");
	String nm=sc.next();
	System.out.println("Enter desg");
	String desg=sc.next();
	System.out.println("Enter sal");
	double sal=sc.nextDouble();
	Employee e=new Employee(empid,nm,desg,sal);
	return edao.save(e);
	
}

@Override
public boolean deleteById(int empid) {
	return edao.removeById(empid);
}

@Override
public boolean modifyById(int empid, double sal) {
	return edao.updateById(empid,sal);
}

@Override
public List<Employee> getAll() {
	return edao.findAll();
}

@Override
public Employee getById(int empid) {
	return edao.findById(empid);
}

@Override
public void writeToFile(String fname) {
	edao.writeData(fname);
	
}
   
}
