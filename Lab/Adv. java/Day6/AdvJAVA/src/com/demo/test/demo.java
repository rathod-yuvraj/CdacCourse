package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class demo {

	public static void main(String[] args) {
		
			Connection conn =null;
			try {
				DriverManager.registerDriver(new Driver());
				String url = "jdbc:mysql://localhost:3306test?useSSL=false";
				conn=DriverManager.getConnection(url,"root","root123");
				CallableStatement cst = conn.prepareCall("call getcnt(?,?");
				cst.setInt(1,10);
				cst.registerOutParameter();
				cst.execute();
			int cnt=cst.getInt(2);
			System.out.println("count "+ cnt);
			
				
				
				
			
		

	}

}
