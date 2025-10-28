package com.yuvraj.service;

import java.util.List;

import com.yuvraj.beans.Employee;

public interface EmployeeService{

	boolean AddNewEmployee();

	List<Employee> DisplayAll();

	boolean RemoveById(int id);

}
