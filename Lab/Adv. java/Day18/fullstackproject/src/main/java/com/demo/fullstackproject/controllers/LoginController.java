package com.demo.fullstackproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.fullstackproject.beans.MyUser;
import com.demo.fullstackproject.service.LoginService;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/")
public class LoginController {
	@Autowired
	LoginService lservice;

	@GetMapping("/login")
	public String showLogin(@PathVariable("user") String username,@PathVariable("pass") String password) {
		MyUser user=lservice.checkedUser(username,password);
		
		if(user!=null) {
			return "login successfully";
		}else {
			return "login Not found";
			
		}
		
		
		
	}

}
