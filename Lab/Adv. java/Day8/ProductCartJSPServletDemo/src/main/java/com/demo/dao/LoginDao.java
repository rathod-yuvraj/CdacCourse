package com.demo.dao;

import com.demo.beans.MyUser;

public interface LoginDao {

	MyUser checkedUser(String user, String pass);

}
