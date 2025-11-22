package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestPrepareStatement {

	public static void main(String[] args) {
//		
		Connection conn=null;
		try {
//			Step 1: Register Driver
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//			Step 2 get Connection with database
			String url="jdbc:mysql://192.168.10.117:3306/dac64?userSSL=false";
			conn=DriverManager.getConnection(url, "dac64", "welecome");
//			Step 3: Create Statements write Query
			
			 PreparedStatement pst=conn.prepareStatement("select * from emp");
			 
			 ResultSet rs=pst.executeQuery();
			 while(rs.next()) {
				 System.out.println("Eis"+rs.getInt("EMPNO"));
				 System.out.println("Ename"+rs.getString("ENAME"));
			 }
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
