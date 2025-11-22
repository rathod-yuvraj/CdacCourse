package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
static Connection conn=null;

public static Connection getMyConnection()
{ if(conn==null) {
	try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String url="jdbc:mysql://192.168.10.117:3306/dac65?useSSL=false";
	try {
		conn=DriverManager.getConnection(url,"dac65","welcome");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
return conn;
	
	
}
	
	
	
	public  void closeMyconnection() {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
