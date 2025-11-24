package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.MyUsers;

public class LoginDaoImpl implements LoginDao {
	static Connection conn;
	static {
		conn=DBUtil.getMyConnection();
	}

	@Override
	public MyUsers checkUser(String uname, String pass) {
		
		
		
		try {
			String sql="select uname,email ,role from user where uname=? and password=?";
			PreparedStatement seluser=conn.prepareStatement(sql);
			seluser.setString(1, uname);
			seluser.setString(2, pass);
			
			ResultSet rs=seluser.executeQuery();
			if(rs.next()) {
				MyUsers u=new MyUsers(rs.getString(1),rs.getString(2),rs.getString(3));
				return u;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	

}
