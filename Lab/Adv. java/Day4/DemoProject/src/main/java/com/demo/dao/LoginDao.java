package com.demo.dao;

import com.demo.bean.MyUser;

public interface LoginDao {

	MyUser checkedUser(String uname, String pass);

}
