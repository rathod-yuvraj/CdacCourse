package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.MyUser;


public class LoginDaoImpl  implements LoginDao{
	static Connection conn;
	static PreparedStatement seluser;
	
	static {
		
		try {
//			conn=DBMyConnection.getMyConncetion();
			conn=DBUtil.getMyConncetion();
			seluser=conn.prepareStatement("select  username,  role,email from user where username=? and password=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public MyUser checkedUser(String username, String password) {
		
		try {
			seluser.setString(1, username);
			seluser.setString(2, password);
			ResultSet rs=seluser.executeQuery();
			if(rs.next()) {
			MyUser user=new MyUser(rs.getString("username"),rs.getString("role"),rs.getString("email"));
			return user;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

}
