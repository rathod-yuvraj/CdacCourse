package demo.com.dao;

import java.util.Set;

import demo.com.Beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	Set<Employee> findAll();

}
