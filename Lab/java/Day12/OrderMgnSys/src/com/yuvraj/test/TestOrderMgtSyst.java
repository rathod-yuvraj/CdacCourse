package com.yuvraj.test;
import java.util.Scanner;
import com.yuvraj.service.*;

public class TestOrderMgtSyst {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		OrderService oservice =new OrderServiceImpl(); 
		
		int choice=0;
		
		do {
			System.out.println("1. add New Customer\n2.Add New Item");
			switch(choice) {
			case 1->{
				boolean status=oservice.addNewCustomer();
				if(status) {
					System.out.println("New Customer Added Successfull!");
				}
				else {
					System.out.println("Not Added Customer!.....");
				}
			}
			}
		}while(choice!=9);
	}

}
