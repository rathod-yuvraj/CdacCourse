package com.yuvraj.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.yuvraj.beans.Employee;
import com.yuvraj.dao.EmployeeDao;
import com.yuvraj.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao edao;

    public EmployeeServiceImpl() {
        edao = new EmployeeDaoImpl();
    }

    //  1. Add new employee
    @Override
    public boolean AddNewEmployee() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Role: ");
        String role = sc.nextLine();

        Employee e = new Employee(id, name, role);
        return edao.save(e);
    }

    //  2. Display all employees
    @Override
    public List<Employee> DisplayAll() {
        return edao.FindAll();
    }

    // 3. Remove employee by ID
    @Override
    public boolean RemoveById(int id) {
        return edao.DeleteById(id);
    }

    //  4. Display employees in sorted order
    @Override
    public List<Employee> DisplaySortedEmployees() {
        List<Employee> list = edao.FindAll();
        return list.stream()
                   .sorted(Comparator.comparingInt(Employee::getEmpID))
                   .collect(Collectors.toList());
    }

    // 🔹 5. Find employee by name
    @Override
    public Employee FindByName(String name) {
        List<Employee> list = edao.FindAll();
        for (Employee emp : list) {
            if (emp.getEmpName().equalsIgnoreCase(name)) {
                return emp;
            }
        }
        return null;
    }

    // 🔹 6. Save all employees into file
    @Override
    public boolean SaveAllToFile(String filename) {
        List<Employee> employees = edao.FindAll();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(employees);
            return true;
        } catch (IOException e) {
            System.out.println(" Error saving file: " + e.getMessage());
            return false;
        }
    }
}
