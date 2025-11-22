package com.demo.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.demo.beans.MyUser;

public class LoginDaoImpl implements LoginDao{
	static Connection conn;
	static {
		conn=DBUtil.MyConnection();
		
	}
	@Override
	public MyUser checkUser(String uname, String pass) {
		try {
			PreparedStatement seluser=conn.prepareStatement("select uname,email,role from user where uname=? and password=? ");
			seluser.setString(1, uname);
			seluser.setString(2, pass);
			ResultSet rs=seluser.executeQuery();
			if(rs.next())
			{
				MyUser u=new MyUser(rs.getString(1),rs.getString(2),rs.getString(3));
			    return u;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}

//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import com.demo.beans.MyUser;
//
//public class LoginDaoImpl implements LoginDao {
//	static Connection conn=null;
//	static {
//		conn=DBUtil.MyConnection();
//		
//	}
//
//	@Override
//	public MyUser checkUser(String uname, String pass) {
////		| uname | mail          | role | pass
//		PreparedStatement seluser;
//		try {
//			seluser = conn.prepareStatement("select uname,main,role from myuser where uname=? and pass=? ");
//			seluser.setString(1,uname);
//			seluser.setString(2, pass);
//			ResultSet rs=seluser.executeQuery();
//			if(rs.next()) {
//				MyUser u=new MyUser(rs.getString(1),rs.getString(2),rs.getString(3));
//				System.out.println();
//				return u;
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//		
//		
//	
//	}
//
//}
