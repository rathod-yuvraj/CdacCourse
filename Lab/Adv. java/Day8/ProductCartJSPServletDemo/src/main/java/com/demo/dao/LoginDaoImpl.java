package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.MyUser;

public class LoginDaoImpl implements LoginDao {

	static Connection conn;
	static PreparedStatement seluser;
	static {

		try {
			conn = DBUtil.getMyConnection();
			seluser = conn
					.prepareStatement("select id, username,role,email from user where username = ?and password = ?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public MyUser checkedUser(String username, String pass) {

		try {
			seluser.setString(1, username);
			seluser.setString(2, pass);

			ResultSet rs = seluser.executeQuery();
			if (rs.next()) {

				MyUser user = new MyUser(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public static void main(String[] args) {
		LoginDaoImpl dao = new LoginDaoImpl();

		// Try with sample credentials
		MyUser user = dao.checkedUser("admin", "admin");

		if (user != null) {
			System.out.println("User found:");
			System.out.println("ID: " + user.getId());
			System.out.println("Username: " + user.getUsername());
			System.out.println("Email: " + user.getEmail());
			System.out.println("Role: " + user.getRole());
		} else {
			System.out.println("No user found with given credentials.");
		}
	}

}
