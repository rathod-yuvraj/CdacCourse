package com.dom.service;

import com.demo.beans.MyUser;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {
	 
	private LoginDao ldao;
	
	

	public LoginServiceImpl() {
		super();
		this.ldao =new LoginDaoImpl();
	}



	@Override
	public MyUser valideUser(String username, String pass) {
		
		return ldao.checkedUser(username,pass);
	}

}
