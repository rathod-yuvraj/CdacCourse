package com.yuvraj.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.yuvraj.beans.Student;
import com.yuvraj.service.StudentService;
import com.yuvraj.service.StudentServiceImpl;

public class testStudentMgnt {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		StudentService eservice= new StudentServiceImpl();
		System.out.println("Enter choice:");
		int choice=0;
		
		do {
			System.out.println("1.add New Student\n2.display All\n.3search by id\n4.search by name\n");
			System.out.println("5.search by mark\n6. Enter choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1->{
			
				boolean status=eservice.addNewStudent();
				if(status) {
					System.out.println("New Student Add Successfully!");
				}else {
					System.out.println("Not Added!");
				}
			}
			case 2->{
				Set<Student> elist=eservice.displayAll();
				elist.forEach(System.out::println);
			}
			
			}
			
		}while(choice!=12);
		

	}

}
