package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.bean.MyUser;

public class LoginDaoImpl implements LoginDao {
	
	static Connection conn=null;
    static PreparedStatement seluser;
    static {
    	
    	try {
    		conn=DBUtil.getMyConnection();
			seluser=conn.prepareStatement("select uname,email,role from user where uname=? and password=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	@Override
	public MyUser checkedUser(String uname, String pass) {
	    String sql = "SELECT uname, email, role FROM user WHERE uname=? AND password=?";
	    try (Connection conn = DBUtil.getMyConnection();
	         PreparedStatement ps = conn.prepareStatement(sql)) {
	        
	        ps.setString(1, uname);
	        ps.setString(2, pass);
	        
	        try (ResultSet rs = ps.executeQuery()) {
	            if (rs.next()) {
	                return new MyUser(
	                    rs.getString("uname"),
	                    rs.getString("email"),
	                    rs.getString("role")
	                );
	            }
	        }
	    } catch (SQLException e) {
	        logger.error("Login check failed", e);
	    }
	    return null;
	}

}
