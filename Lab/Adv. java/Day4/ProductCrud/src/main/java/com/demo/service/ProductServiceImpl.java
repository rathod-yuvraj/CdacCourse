package com.demo.service;

import java.util.List;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoimpl;

public class ProductServiceImpl implements ProductService {

	private ProductDao pdao;
	



	public ProductServiceImpl() {
		
		pdao = new ProductDaoimpl();
	}




	@Override
	public boolean addProduct(Product p) {
		// TODO Auto-generated method stub
		return pdao.productAdd(p);
	}




	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return pdao.findallproducts();
	}

}
