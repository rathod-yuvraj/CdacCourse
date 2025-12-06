package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HellowController {
	
	@GetMapping("/")
	public String homePage() {
		
		return "index";
	}
	
	@GetMapping("/say")
	public String sayHello() {
		
		return "Welcome to my Page";
	}
	
	@GetMapping("/welcome")
	public ModelAndView sayWelcome() {
		String message="Welcome message to controller!..";
		
		
		return  new ModelAndView("welcome","message",message);
	}
	
	@GetMapping("/test")
	public String testMy(Model model) {
		
		model.addAttribute("yuvraj","yuvraj@gmail.com");
		
		
		return "myView";
		
	}

}
