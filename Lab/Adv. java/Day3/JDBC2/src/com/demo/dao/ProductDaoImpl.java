package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao {
	static Connection cons;
	
	static PreparedStatement pst,deleteById,modifyById,getDisplay;
	
	static {
		try {
		cons=DBUtil.getMyConnection();
	
			pst=cons.prepareStatement("insert into myproduct values(?,?,?,?,?)");
			deleteById=cons.prepareStatement("delete from myproduct where pid=? ");
			modifyById=cons.prepareStatement("update  myproduct set qty=? ,price=?  where  pid=?");
			getDisplay=cons.prepareStatement("select * from myproduct");
			
		       
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean save(Product s) {
		
		try {
			pst.setInt(1,s.getPid());
			pst.setString(2, s.getPname());
			pst.setInt(3, s.getQty());
			pst.setDouble(4, s.getPrice());
			pst.setDate(5, java.sql.Date.valueOf(s.getLdt()));
			int n=pst.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean removedbyId(int id) {
	try {
		deleteById.setInt(1,id);
		int n =deleteById.executeUpdate();
		if(n>0)
			return true;
		
	}catch (SQLException e) {
		e.printStackTrace();
	}
		return false;
	}

	@Override
	public boolean updateById(int pid, int qty, double price) {
	    try {
	        modifyById.setInt(1, qty);      // qty → first placeholder
	        modifyById.setDouble(2, price); // price → second placeholder
	        modifyById.setInt(3, pid);      // pid → third placeholder

	        int n = modifyById.executeUpdate();
	        if (n > 0) {
	            return true;
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return false;
	}

	@Override
	public List<Product> alldisplay() {
	
		List<Product> plist=new ArrayList<>();
	
		try {
			ResultSet p=getDisplay.executeQuery();
			while(p.next()) {
			plist.add(new Product(p.getInt(1),p.getString(2),p.getInt(3),p.getDouble(4),p.getDate(5).toLocalDate()));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


}
