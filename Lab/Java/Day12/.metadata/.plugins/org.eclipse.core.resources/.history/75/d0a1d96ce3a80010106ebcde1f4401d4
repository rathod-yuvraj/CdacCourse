package com.yuvraj.service;
import java.util.*;

import com.yuvraj.dao.*;
import com.yuvraj.beans.*;
public class OrderServiceImpl implements OrderService {
	Scanner sc=new Scanner(System.in);
	
	private OrderDao odao;

	public OrderServiceImpl() {
		super();
		odao = new OrderDaoImpl();
	}

	@Override
	public boolean addNewCustomer() {
		
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter Name");
		String nm=sc.next();
		System.out.println("Enter mobile");
		String mb=sc.next();
		
		Customer c=new Customer(id,nm,mb);
		
		return odao.save(c);
	}

}
