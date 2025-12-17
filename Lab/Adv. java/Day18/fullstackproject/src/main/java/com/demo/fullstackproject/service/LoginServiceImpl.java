package com.demo.fullstackproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.fullstackproject.beans.MyUser;
import com.demo.fullstackproject.dao.LoginDao;

@Service
public class LoginServiceImpl implements  LoginService {
	@Autowired
	LoginDao ldao;

	@Override
	public MyUser checkedUser(String username, String password) {
		
		
		return ldao.authUser(username,password);
	}

}
