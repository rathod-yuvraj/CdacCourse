package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection conn;
	public static Connection getMyConnection() {
//		Step 1 declaration to java to mysql
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
//			Step 2 connection java to mysql server
//			String url="jdbc:mysql://192.168.10.117:3306/dac64?useSSL=false";
			String url1="jdbc:mysql://192.168.10.117:3306/dac64?useSSL=false";
			conn=DriverManager.getConnection(url1,"dac64","welcome");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return conn;
		
		
	}
	public static void closeMyConnection(){
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
public static void main(String[] args) {
	
	System.out.println("Getmyconnection+"+ getMyConnection());
	
}
}
