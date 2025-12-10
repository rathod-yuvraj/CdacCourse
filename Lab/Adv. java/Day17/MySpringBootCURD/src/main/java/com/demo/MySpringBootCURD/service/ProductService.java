package com.demo.MySpringBootCURD.service;

import java.util.List;

import com.demo.MySpringBootCURD.dto.ProductDto;

public interface ProductService {

	List<ProductDto> getAllProducts();

	ProductDto getById(int pid);

	List<ProductDto> getByprice(double lprice, double hprice);

	boolean addproduct(ProductDto p);

	boolean UpdateProduct(ProductDto p);

	boolean Deleteproduct(ProductDto p);

	List<ProductDto> getAllProduct();

	List<ProductDto> getAllProducts1();

}
