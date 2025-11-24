package com.demo.dao;

import com.demo.beans.MyUsers;

public interface LoginDao {

	MyUsers checkUser(String uname, String pass);

}
