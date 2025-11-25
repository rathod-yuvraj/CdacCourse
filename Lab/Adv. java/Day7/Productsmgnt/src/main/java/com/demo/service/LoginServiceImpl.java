package com.demo.service;

import com.demo.beans.MyUsers;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {
	
	private LoginDao ldao;

	public LoginServiceImpl() {
		super();
		this.ldao =new LoginDaoImpl();
	}

	@Override
	public MyUsers validateUser(String uname, String pass) {
		
		return ldao.checkUser(uname,pass);
	}

}
