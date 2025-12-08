package com.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.MyUser;
import com.demo.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService lservice;
	
	@GetMapping("/loginuser")
	 public String showLogin() { 
		 
		 return "login";
	 }
	
	@PostMapping("/validateUser")
	public ModelAndView validateUser(HttpSession session,  @RequestParam("username") String username,@RequestParam("pass") String password) {
		MyUser user=lservice.validateUser(username,password);
		if(user!=null) {
			session.setAttribute("username", user);
			
			return new ModelAndView("redirect:/product/showproduct");
		}else {
			   return new ModelAndView("login","message","invalid credentials");
		   }
		
		
		
	}
	
	

}
