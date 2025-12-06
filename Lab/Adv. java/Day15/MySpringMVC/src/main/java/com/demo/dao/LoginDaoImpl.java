package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.MyUser;



@Repository
public class LoginDaoImpl implements LoginDao{

	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	

	public MyUser checkedUser(String username, String password) {
	
		String sql = "select * from user where username = ? and password=?";
        MyUser user = jdbcTemplate.queryForObject(
            sql,
            new Object[]{username,password},
            BeanPropertyRowMapper.newInstance(MyUser.class)
        );
		System.out.println(user);
		
		return user;
	}

}
