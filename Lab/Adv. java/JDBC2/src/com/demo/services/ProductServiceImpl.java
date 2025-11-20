package com.demo.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.demo.beans.Products;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	private ProductDao pdao; 
	public ProductServiceImpl() {
		   pdao=new ProductDaoImpl();
	   }
	@Override
	public boolean addNewProuct() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Product Id ");
		int id = sc.nextInt();
		System.out.println("Enter the Product Name ");
		String pname = sc.next();
		System.out.println("Enter the Quantity ");
		int qty =sc.nextInt();
		System.out.println("Enter the Price ");
		double price = sc.nextDouble();
		System.out.println("Enter the the Date  ");
		String dt=sc.next();
		LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Products p=new Products (id,pname,qty,price,ldt);
		
		return pdao.save(p);
		
	
	}
	@Override
	public boolean modifyById(int id, int qty, double price) {
		return pdao.updateById(id,qty,price);
	}
	

}
