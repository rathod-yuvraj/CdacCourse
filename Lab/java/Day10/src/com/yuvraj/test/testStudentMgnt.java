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
			System.out.println("1.add New Student\n2.display All\n3.search by id\n4.search by name\n");
			System.out.println("5.search by mark\n6.Sort By ID Enter choice");
			System.out.println("12.Exit");
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
			case 3->{
				System.out.println("Enter Roll");
				int roll=sc.nextInt();
				Student s=eservice.searchById(roll);
				if(s!=null) {
					System.out.println(s);
				} else {
					System.out.println("Not Found!....");
				}
				
			}
			case 4->{
				System.out.println("Enter Name");
				String nm=sc.next();
				Set<Student> s=eservice.searchByName(nm);
				if(s!=null) {
					s.forEach(System.out::println);
				}
				else {
					System.out.println("Not Found!.......");
				}
			}
			case 5->{
				System.out.println("Enter Mark");
				int mk=sc.nextInt();
				Set <Student> s=eservice.searchByMark(mk);
				if(s!=null) {
					s.forEach(System.out::println);
				} else {
					System.out.println("Not Found......");
				}
			}
			case 6->{
				List<Student> elist=eservice.sortByName();
				elist.forEach(System.out::println);
				
				
			}
			case 12->{
				System.out.println("Thank You For Visiting.....");
			}
			default ->{
				System.out.println("Wrong Choice....");
			}
			
			}
			
		}while(choice!=12);
		

	}

}
