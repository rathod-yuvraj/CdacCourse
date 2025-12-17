package com.demo.fullstackproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.fullstackproject.beans.MyUser;

public interface LoginDao extends JpaRepository<MyUser, Integer> {

	MyUser authUser(String username, String password);
	

}
