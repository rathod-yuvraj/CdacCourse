package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;

public class ProductDaoimpl implements ProductDao  {
        
	static Connection  conn;
	static PreparedStatement selproduct, insproduct,findproduct;
    
	static {
		conn=DBUtil.getMyConnection();
		try {
			
			selproduct = conn.prepareStatement("select * from myproduct");
			insproduct=conn.prepareStatement("insert into myproduct values( ?,?,?,?,?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean productAdd(Product p) {
		
		try {
			insproduct.setInt(1,p.getPid());
			insproduct.setString(2, p.getPname());
			insproduct.setDouble(3, p.getQty());
			insproduct.setDouble(4, p.getPrice());
//			insproduct.setDate(5,java.sql.Date.valueOf(p.getExpdt()));
			insproduct.setInt(5, p.getCid());
			
			int n=insproduct.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public List<Product> findallproducts() {
		List<Product> plist=new ArrayList<>();
		try {
			ResultSet rs=selproduct.executeQuery();
			while(rs.next()) {
				plist.add(new Product(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getDouble(4),rs.getInt(6)));
			}
			return plist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	


	
}
