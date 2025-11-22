package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class TestCreateStatement {

	public static void main(String[] args) {
		Connection conn =null;
		//step 2
		try {
			
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			conn = DriverManager.getConnection("jdbc:mysql://192.168.10.177:3306/dac64?useSSL=false","dac64","welcome");
			if(conn!=null) {
				System.out.println("connection is found my frind ");
			}else {
				System.out.println("connection not found ");
			}
			
			Statement st=conn.createStatement();
			//Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from myproduct");
			if(rs.next()) {
				// pid  | pname | qty   | price   | dt
				System.out.println("pid"+rs.getInt(1));
				System.out.println("pname"+rs.getString(2));
				System.out.println("qty"+rs.getInt(3));
				System.out.println("price"+rs.getDouble(4));
				System.out.println("MfgDate"+rs.getDouble(5));
				System.out.println("-------------->");
			}
			
			//int pid =123;
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
