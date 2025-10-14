package demo.com.daos;

import java.util.List;

import demo.com.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> findAll();

	Employee findById(int eid);

	boolean removeById(int eid);

	List<Employee> findByName(String nm);



}
