package com.yuvraj.service;

import java.util.List;

import com.yuvraj.beans.Employee;

public interface EmployeeService{

	boolean AddNewEmployee();

	List<Employee> DisplayAll();

	boolean RemoveById(int id);
	  List<Employee> DisplaySortedEmployees();   // For sorted employee list

    Employee FindByName(String name);          // For searching employee by name

    boolean SaveAllToFile(String filename); 

}
