package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.MyUser;

@Repository
public class LoginDaoImpl implements LoginDao{
	@Autowired
	JdbcTemplate template;

	public MyUser checkedUser(String username, String password) {
		try {
		MyUser u=template.queryForObject("select * from user where username=? and password=?",
				new Object[] { username, password},BeanPropertyRowMapper.newInstance(MyUser.class)
				
				);
		
		System.out.println(u);
		return u;
		}catch(EmptyResultDataAccessException e){
			
			return null;
		}
	}

}
