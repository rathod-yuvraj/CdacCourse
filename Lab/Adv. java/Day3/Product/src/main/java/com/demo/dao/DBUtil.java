package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	    private static Connection conn;

	    public static Connection getMyConncetion() {
	        if (conn == null) {
	            try {
	                Class.forName("com.mysql.cj.jdbc.Driver");
	                conn = DriverManager.getConnection(
	                    "jdbc:mysql://192.168.10.117:3306/dac64", "dac64", "welcome");
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	        return conn;
	    }
	

}
