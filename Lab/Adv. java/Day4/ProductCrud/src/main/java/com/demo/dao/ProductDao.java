package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	boolean productAdd(Product p);

	List<Product> findallproducts();

}
