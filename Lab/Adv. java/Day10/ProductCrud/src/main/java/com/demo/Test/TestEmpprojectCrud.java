package com.demo.Test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
import com.demo.service.ProjectService;
import com.demo.service.ProjectServiceImpl;

public class TestEmpprojectCrud {

	public static void main(String[] args) {
		// TODO Auto-generated
		Scanner sc = new Scanner(System.in);
		ProjectService pservice = new ProjectServiceImpl();
		EmployeeService eservice = new EmployeeServiceImpl();
		
		int choice=0;
		do {
			System.out.println("1 ADD PROJRCT");
			System.out.println("2 ADD ALL EMPLOYEEE E");
			System.out.println("3 SHOW ALL EMPLYEEE");
			System.out.println("4 DELETE EMEPLOYEEEE");
			System.out.println("5 UPDATE EMPLYEE SALARY");
			System.out.println("6 EXIT N/CHOICE ");
		choice= sc.nextInt();
		switch(choice) {
			case 1 ->{
				boolean status=pservice.addNewProject();
				if(status) {
					System.out.println("emplyee added succesfully");
				}else {
					System.out.println("not added susceesfullty");
				}
			}
			case 2 ->{
				boolean status =eservice.addNewEmployee();
				if(status) {
					System.out.println("emplyee added succesfully");
				}else {
					System.out.println("not added susceesfullty");
				}
			}
			case 3 ->{
				List<Employee> elist=eservice.getAllEmployee();
				elist.stream().forEach(System.out::println);
			}
			case 4 ->{
				System.out.println("DELTE THE EMPLYEE");
				int empid=sc.nextInt();
				boolean status = eservice.deletebyId(empid);
				if(status) {
					System.out.println("EMPLYEE DELETED SUCCESFULLL");
				}else {
					System.out.println("NOT FOUND EMPLYEE ID");
				}
			}
			case 5 ->{
				System.out.println("ENTER EMPLOYEE ID TO UPDATE SALARY");
				int empid =sc.nextInt();
				System.out.println("ENTER THE SALARY");
				double sal = sc.nextDouble();
				System.out.println("ENRETT HE NEW NAME");
				String name =sc.next();
				boolean status=eservice.updateEmployeeById(empid,name,sal);
				if(status) {
					System.out.println("UPADTE THE SUCCESFULLYT");
					
				}else {
					System.out.println("NOT UPDATED SUCCESFULLY");
				}
				
				
			}
			case 6 ->{
		    	sc.close();
		    	eservice.closeMySessionFactory();
		    	System.out.println("Thank you for visiting .......");
		    }
			default ->{
				System.out.println("ENTER THE CORRECT CHOICE ");
			}
		}
			
		
		
			
			
			
		}while(choice!=6);
		
		
		

	}

}
