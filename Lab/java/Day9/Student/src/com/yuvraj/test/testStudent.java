package com.yuvraj.test;
import java.util.*;


import com.yuvraj.beans.Student;
import com.yuvraj.servic.*;
import com.yuvraj.servic.StudentServiceImpl;
public class testStudent {
	
	

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		StudentService eservice=new StudentServiceImpl();

		int choice=0;
		
		do {
			System.out.println("1.add Student\n2.Display all\n3.search by roll\n4. search by name\n5.search by age");
			System.out.println("6.Search by mark\n7.update Mark\n8.delect by roll");
			System.out.println("9.delect by mark\n10.sort by roll\n11.sort by name\n12.Exit\nchoice");
			System.out.println("Enter the choice:");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1->{
				boolean status=eservice.addNewStudent();
				if(status) {
					System.out.println("Add Student Successfull!");
					
				} else {
					System.out.println("Not Added! ");
				}
			
				
			}
			case 2->{
				List<Student> elist=eservice.displayAll();
				elist.forEach(System.out::println);
			}
			case 3->{
				System.out.println("enetr roll  for search");
				int sRoll =sc.nextInt();
				Student e=eservice.searchByRoll(sRoll);
				if(e!=null) {
					System.out.println(e);
				}else {
					System.out.println("not found");
				}
			}
			case 4->{
				System.out.println("enter the name");
				String name =sc.next();
			List <Student> s=eservice.searchByName(name);
			}
			
			}
			
		}while(choice!=12);
	
	}
}
