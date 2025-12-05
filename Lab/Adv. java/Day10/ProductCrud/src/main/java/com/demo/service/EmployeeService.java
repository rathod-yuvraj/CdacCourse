package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;


public interface EmployeeService {

	boolean addNewEmployee();

	List<Employee> getAllEmployee();

	boolean deletebyId(int empid);

	boolean updateEmployeeById(int empid, String name, double sal);

	boolean addProjectToEmployee(int eid, int pid);

	void closeMySessionFactory();

}
