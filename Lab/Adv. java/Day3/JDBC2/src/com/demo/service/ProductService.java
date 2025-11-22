package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	boolean addNewProduct();

	boolean deletebyId(int id);

	boolean modifybyId(int id, int qty, double price);

	List<Product> getAllDisplay();

	

}
