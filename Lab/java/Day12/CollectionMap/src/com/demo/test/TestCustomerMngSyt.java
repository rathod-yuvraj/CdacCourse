package com.demo.test;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.service.*;
public class TestCustomerMngSyt {

	public static void main(String[] args) {
		Scanner  sc = new Scanner (System.in);
		CustomerService cservice = new CustomerServiceImpl();
		int choice = 0;
		do {
			System.out.println("1 add new customer\n 2 Display All\n 3 Delete customer \n 5.delete by value");
			System.out.println("Enter the choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1-> 
			{
				   boolean status = cservice.addNewCustomer();
				   if(status) {
					System.out.println("add new customer succesfully ");
					
				}else {
					System.out.println("customer is not added ");
				}
			}
			case 2 ->
			{          
			        Map<String,Integer> hm=cservice.displayAll();
			        Set<String>keys=hm.keySet();
			        keys.forEach(System.out::println);
			}
			
			
			case 3->{
				System.out.println("Enter course name");
				String cname=sc.next();
				boolean status=cservice.deleteByName(cname);
				if(status) {
					System.out.println("deleted succesfully");
				}else {
					System.out.println("not found");
				}
				
			}
			case 4->{
				System.out.println("Enter Price:");
				int p=sc.nextInt();
				boolean status=cservice.deletedByValue(p);
				if(status) {
					System.out.println("Deleted Succesfully!");
					
				}else {
					System.out.println("Not Found");
				}
				
				
			}
			}
		}while(choice!=10);

	}

}
