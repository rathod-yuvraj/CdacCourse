package com.demo.fullstackproject.service;

import com.demo.fullstackproject.beans.MyUser;

public interface LoginService {

	MyUser checkedUser(String username, String password);

}
