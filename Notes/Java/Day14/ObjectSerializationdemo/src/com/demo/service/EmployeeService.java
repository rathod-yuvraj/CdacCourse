package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void readFile(String fname);

	boolean addNewEmployee();

	boolean deleteById(int empid);

	boolean modifyById(int empid, double sal);

	List<Employee> getAll();

	Employee getById(int empid);

	void writeToFile(String string);

}
