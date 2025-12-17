package com.demo.MySpringBootCURD.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.MySpringBootCURD.beans.Product;
import com.demo.MySpringBootCURD.dao.ProductDao;
import com.demo.MySpringBootCURD.dto.ProductDto;
import com.demo.MySpringBootCURD.mapper.ProductDtoMapper;
@Service
public class ProductServiceImpl implements ProductService  {
	@Autowired
	private ProductDao pdao;

	@Override
	public List<ProductDto> getAllProducts() {
		List<Product> plist=pdao.findAll();
		List<ProductDto>plist1=plist.stream().map(prod->ProductDtoMapper.mapToProductDto(prod))
				.collect(Collectors.toList());
		return plist1;
	}

	@Override
	public ProductDto getById(int pid) {
		Optional<Product> p=pdao.findById(pid);
		if(p.isPresent()) {
			ProductDto pDto=ProductDtoMapper.mapToProductDto(p.get());
			return pDto;
		}
		return null;
		
	
	}

	@Override
	public List<ProductDto> getByprice(double lprice, double hprice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addproduct(ProductDto p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean UpdateProduct(ProductDto p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Deleteproduct(ProductDto p) {
		//ProductDto p=ProductDtoMapper.mapToProductDto(p.get());
		
//		Product p=
		return false;
	}

	@Override
	public List<ProductDto> getAllProducts1() {
		List<Product> plist=pdao.findAll();
		List<ProductDto> plist1=plist.stream()
				.map(p1->ProductDtoMapper.mapToProductDto(p1))
				.collect(Collectors.toList());
		return plist1;

	}
	
	public List <ProductDto> getAllProduct(){
		List<Product> pi=pdao.findAll();
		List<ProductDto>plist.stream().
	}

}
