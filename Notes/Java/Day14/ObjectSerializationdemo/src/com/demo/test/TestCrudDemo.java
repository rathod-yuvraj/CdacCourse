package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestCrudDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl();
		eservice.readFile("empdata1.txt");
		int choice=0;
		do {
			System.out.println("1. add new Employee\n2. delete by id\n");
			System.out.println("3. modify by id\n4.display all\n5. display by id\n6. exit\nchoice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1->{
				boolean status=eservice.addNewEmployee();
				if(status) {
					System.out.println("employee added successfully");			
				}else {
					System.out.println("Not added");
				}
			}
			case 2->{
				System.out.println("Enter id");
				int empid=sc.nextInt();
				boolean status=eservice.deleteById(empid);
				if(status) {
					System.out.println("deleted successfully");			
				}else {
					System.out.println("Not found");
				}			
			}
			case 3->{
				System.out.println("Enter id");
				int empid=sc.nextInt();
				System.out.println("enetr new sal");
				double sal=sc.nextDouble();
				boolean status=eservice.modifyById(empid,sal);
				if(status) {
					System.out.println("modified successfully");			
				}else {
					System.out.println("Not found");
				}
			}
			case 4->{
				List<Employee> list=eservice.getAll();
				list.forEach(System.out::println);
			}
			case 5->{
				System.out.println("Enter id");
				int empid=sc.nextInt();
				Employee ob=eservice.getById(empid);
				if(ob!=null) {
					System.out.println(ob);
				}else {
					System.out.println("not found");
				}
			}
			case 6->{
				eservice.writeToFile("empdata1.txt");
				sc.close();
				System.out.println("Thank you for visiting......");
			}
			default->{
				System.out.println("wrong choice");
			}
			}
		}while(choice!=6);

	}

}
