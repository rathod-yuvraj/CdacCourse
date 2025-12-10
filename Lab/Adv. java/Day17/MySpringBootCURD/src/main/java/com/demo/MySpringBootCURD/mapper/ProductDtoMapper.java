package com.demo.MySpringBootCURD.mapper;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.demo.MySpringBootCURD.beans.Product;
import com.demo.MySpringBootCURD.dto.ProductDto;





public class ProductDtoMapper {

	public static Product mapToProduct(ProductDto p) {
		
		return new Product(p.getPid(),p.getPname(),p.getQty(),p.getPrice(),LocalDate.parse(p.getLdtstr(),DateTimeFormatter.ofPattern("dd/MM/yyyy")),p.getCid());
	}
	
	public static ProductDto mapToProductDto(Product prod) {
		if(prod.getLdt()==null) {
			return new ProductDto(prod.getPid(),prod.getPname(),prod.getQty(),prod.getPrice(),null,prod.getCid());
		}
		return new ProductDto(prod.getPid(),prod.getPname(),prod.getQty(),prod.getPrice(),prod.getLdt().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),prod.getCid());
	}

}
