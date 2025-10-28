package com.yuvraj.dao;

import java.util.List;

import com.yuvraj.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> FindAll();

	boolean DeleteById(int id);

}
