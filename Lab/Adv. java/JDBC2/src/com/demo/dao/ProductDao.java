package com.demo.dao;

import com.demo.beans.Products;

public interface ProductDao {

	boolean save(Products p);

	boolean removeById(int id);

	boolean updateById(int id, int qty, double price);

}
