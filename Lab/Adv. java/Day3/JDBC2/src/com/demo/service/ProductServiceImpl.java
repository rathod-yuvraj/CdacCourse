package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	private ProductDao pdao;
	
	public ProductServiceImpl() {
	
		pdao= new ProductDaoImpl();
	}

	

	@Override
	public boolean addNewProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter qty");
		int qty=sc.nextInt();
		System.out.println("Enter price");
		double price=sc.nextDouble();
		System.out.println("Enter Date (dd/MM/yyyy)");
		String dt=sc.next();
		
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Product s=new Product(id,name,qty,price,ldt);
		
		return pdao.save(s) ;
	}



	@Override
	public boolean deletebyId(int id) {
		
		return pdao.removedbyId(id);
	}



	@Override
	public boolean modifybyId(int id, int qty, double price) {
		
		return pdao.updateById(id,qty,price);
	}



	@Override
	public List<Product> getAllDisplay() {
		
		return pdao.alldisplay();
	}

}
