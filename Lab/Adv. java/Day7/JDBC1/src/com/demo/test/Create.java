package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

	public static void main (String [] args) {
		
		Connection conn =null;
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url ="jdbc:mysql://192.168.10.117:3306/dac65?useSSL=false";
		      conn = DriverManager.getConnection(url,"dac65","welcome");
		      if (conn!= null){
		    		 Statement st = conn.createStatement ();
		    		 ResultSet rs=st.executeQuery("Select * from product");
		    		 while (rs.next()) {
		    			 System.out.println("pid "+rs.getInt(1));
		    			 System.out.println("Pname: "+rs.getString(2));
		    			 System.out.println("gender: "+rs.getString(3));
		    		 }
		    		 
		    		 
		    		 
			 System.out.println("Connectio is done ");
		}else 
		{System.out.println("not done");
	
		}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
