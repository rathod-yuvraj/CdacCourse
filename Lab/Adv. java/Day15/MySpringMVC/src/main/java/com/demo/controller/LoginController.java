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
    private LoginService lservice;

    @GetMapping("/loginuser")
    public String showLoginForm() {
        return "loginpage";
    }

    @PostMapping("/validateUser")
    public ModelAndView validateUser(HttpSession session,
                                     @RequestParam("username") String username,
                                     @RequestParam("password") String password) {
        MyUser user = lservice.validateUser(username, password);

        if (user != null) {
            session.setAttribute("user", user);
            return new ModelAndView("welcome");
        } else {
            return new ModelAndView("loginpage", "Message", "Invalid Credentials");
        }
    }
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public ModelAndView validateUser(@RequestParam String username,@RequestParam String password ) {
		
		if(username!=null) {
		ModelAndView mv=new ModelAndView("welcome");
		mv.addObject("username",username);
			
			return mv;
		}else {
			return new ModelAndView("login","error","Invalid credential !");
			
			
		}
	}
	*/


