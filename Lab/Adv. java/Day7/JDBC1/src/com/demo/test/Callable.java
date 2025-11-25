package com.demo.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Callable {

	public static void main (String[] args) {
		Connection conn =null;
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//step 2
			String url = "jdbc:mysql://l19.168.10.117:3306?dac65/useSSL=FALSE";
			//step3
              conn =DriverManager.getConnection(url,"dca65","welcome");
              
              CallableStatement cst=conn.prepareCall("call getcnt(?,?)");
          	
          	cst.setInt(1,10);
          	
          	cst.registerOutParameter(2, java.sql.Types.INTEGER);
          	
          	cst.execute();
          	int cnt = cst.getInt(2);
          	System.out.println("count "+cnt);
              
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
