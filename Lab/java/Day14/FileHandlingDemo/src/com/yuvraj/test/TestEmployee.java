package com.yuvraj.test;

import java.util.List;

import com.yuvraj.beans.Employee;
import com.yuvraj.service.*;
public class TestEmployee {

	public static void main(String[] args) {
		 String filePath = "empdata.txt";

	        EmployeeReader reader = new EmployeeReader();
	        List<Employee> employees = reader.readEmployees(filePath);

	        employees.forEach(System.out::println);

	        employees.add(new Employee(34, "yuvraj", "admin", 45678));

	        EmployeeWriter writer = new EmployeeWriter();
	        writer.writeEmployees(filePath, employees);

	}

}
