package com.demo.test;

import java.util.*;
import com.demo.sort.*;

public class TestEmployee {
	public static void main(String args[]) {
		Employee[] arr = new Employee[20];
		Employee emp = new Employee();
		
		arr[0] = new Employee(1, "Saket", 58000);
		arr[1] = new Employee(2, "Rahul", 55000);
		arr[2] = new Employee(3, "Priya", 60000);
		arr[3] = new Employee(4, "Anjali", 54000);
		arr[4] = new Employee(5, "Ravi", 52500);
		arr[5] = new Employee(6, "Amit", 51000);
		arr[6] = new Employee(7, "Simran", 60500);
		arr[7] = new Employee(8, "Kabir", 63000);
		arr[8] = new Employee(9, "Sunita", 59500);
		arr[9] = new Employee(10, "Raj", 52000);
		arr[10] = new Employee(11, "Sneha", 57000);
		arr[11] = new Employee(12, "Karan", 61000);
		arr[12] = new Employee(13, "Vikram", 57500);
		arr[13] = new Employee(14, "Meera", 54500);
		arr[14] = new Employee(15, "Neha", 62200);
		System.out.print(Arrays.toString(arr) );
		 
	    emp.bubbleSort(arr);
	    System.out.println();
	    System.out.print(Arrays.toString(arr) );
	    
	    emp.insertionSort(arr, new Employee(16, "Neha", 4100), 15);
	    System.out.println();
	    System.out.print(Arrays.toString(arr) );
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 15 employees");
//		for (int i = 0; i <= 15; i++) {
//			int id = sc.nextInt();
//			String ename = sc.next();
//			int sal = sc.nextInt();
//
//			arr[i] = new Employee(id, ename, sal);
//		}

	}

}
