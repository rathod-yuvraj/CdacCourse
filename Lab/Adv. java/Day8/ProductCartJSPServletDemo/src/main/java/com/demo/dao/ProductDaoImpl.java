package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao {
  
	 static Connection conn;
	 static PreparedStatement selproduct;
	 static {
		 conn=DBUtil.getMyConnection();
		 try {
			selproduct=conn.prepareStatement("select * from myproduct");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 
	 }
	
	
	@Override
	public List<Product> findAllProducts() {
		List<Product> plist=new ArrayList<>();
		
		try {
			ResultSet rs=selproduct.executeQuery();
			while(rs.next()) {
				
				plist.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4), rs.getDate(5).toLocalDate()));
			}
			return plist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
