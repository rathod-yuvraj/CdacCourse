package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	boolean addProduct(Product p);

	List<Product> getAllProduct();

}
