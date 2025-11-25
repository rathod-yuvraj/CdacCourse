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
		
//		----------+-----------------------------------------------+------+-----+---------+----------------+
//		| id       | int                                           | NO   | PRI | NULL    | auto_increment |
//		| username | varchar(50)                                   | NO   | UNI | NULL    |                |
//		| password | varchar(255)                                  | NO   |     | NULL    |                |
//		| role     | enum('Admin','Editor','Viewer','Contributor') | NO   |     | NULL    |                |
//		| email
		
		try {
			String sql="select username,email ,role from user where username=? and password=?";
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
