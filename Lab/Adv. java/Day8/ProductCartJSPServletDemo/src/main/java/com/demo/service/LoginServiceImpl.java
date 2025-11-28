package com.demo.service;

import com.demo.beans.MyUser;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {
	private LoginDao ldao;

	public LoginServiceImpl() {
		ldao = new LoginDaoImpl();

	}

	@Override
	public MyUser validateuser(String user, String pass) {

		return ldao.checkedUser(user, pass);

	}

}
