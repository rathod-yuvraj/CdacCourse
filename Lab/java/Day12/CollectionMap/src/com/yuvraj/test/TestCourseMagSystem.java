package com.yuvraj.test;

import com.yuvraj.service.CourseServiceImpl;

import java.util.Scanner;

import com.yuvraj.service.CourseService;

public class TestCourseMagSystem {

	public static void main(String[] args) {
		
		 CourseService cservice=new CourseServiceImpl();
		 
		 Scanner sc=new Scanner(System.in);
		 int choice=0;
		 do {
			 System.out.println("1. Add new Course \n2. display All ");
			 
			 switch(choice) {
			 
			 case 1->{
				 System.out.println("Add new Course!");
			 }
			 case 2 ->{
				 
			 }
			 
		}
		 } while(choice!=10);

	}

}
