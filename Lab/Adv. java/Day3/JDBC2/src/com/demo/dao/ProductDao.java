package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	boolean save(Product s);

	boolean removedbyId(int id);

	boolean updateById(int id, int qty, double price);

	List<Product> alldisplay();

}
