package com.yuvraj.dao;

import java.util.List;
import com.yuvraj.beans.Employee;

public interface EmployeeDao {

    //  Add new employee
    boolean save(Employee e);

    //  Fetch all employees
    List<Employee> FindAll();

    //  Delete employee by ID
    boolean DeleteById(int id);

    //  Find employee by name
    Employee FindByName(String name);

    //  Return employees in sorted order (by ID or Name)
    List<Employee> FindAllSorted();

    //  Save all employees to file
    boolean SaveAllToFile(String filename);
}
