package com.yuvraj.test;
import java.util.*;
import com.yuvraj.service.*;
public class TestEmployeeMgst {

	public static void main(String[] args) {
		
	 EmployeeService eservice=new EmployeeServiceImpl() ;


		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("Add New Employee\n2.Update By Id\n3.Update By Salary");
			System.out.println("\n4.delete By Id\n5.delete By Name \n6. delete Salary\n7. Display All");
			System.out.println("8.Exit \n Enter Choice ");
			switch(choice) {
			case 1->{
				boolean status=eservice.addNewEmployee();
				if(status) {
					System.out.println("New Employee Add Successfully!!..");
				}
				else {
					System.out.println("Not Added ");
				}
			}
			case 2->{
				
			}
			}
		}while(choice!=8);

	}

}
