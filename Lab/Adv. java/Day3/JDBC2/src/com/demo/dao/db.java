package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
	static Connection conn=null;
	
	public static Connection getMyConnection() {
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		

			String url="jdbc:mysql://192.168.10.117/dac64?useSSL=false";
			conn=DriverManager.getConnection(url,"dac64","welcome");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
		
	}
	
	public static void closeMyConnections() {
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	

}
