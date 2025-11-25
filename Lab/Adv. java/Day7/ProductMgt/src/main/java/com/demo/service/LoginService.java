package com.demo.service;

import com.demo.beans.MyUsers;

public interface LoginService {

	MyUsers validateUser(String uname, String pass);

}
