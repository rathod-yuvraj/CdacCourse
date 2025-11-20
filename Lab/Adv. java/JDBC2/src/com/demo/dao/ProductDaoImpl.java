package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.demo.beans.Products;

public class ProductDaoImpl implements ProductDao {
	static Connection conn;
	static PreparedStatement insProd;
	
	static {
		conn=DBUtil.getMyConnection();
		try {
			insProd =conn.prepareStatement("insert into myproduct values(?,?,?,?,?)");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	} 
	
	
	
	

	@Override
	public boolean save(Products p) {
		
			try {
				insProd.setInt(1,p.getPid());
			
			insProd.setString(2,p.getPname());
			insProd.setInt(3,p.getQty());
			insProd.setDouble(4,p.getPrice());
			insProd.setDate(5, java.sql.Date.valueOf(p.getLdt()));
            int n=insProd.executeUpdate();
            return n>0;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		return false;
	}
	
	@Override
	public boolean removeById(int id) {
		try {
			deleteById.setInt(1, id);
			int n=deleteById.executeUpdate();
			if(n>0)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
