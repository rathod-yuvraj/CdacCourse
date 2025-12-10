package com.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	EmployeeService eservice;
	
	@GetMapping("/showemployee")
	public ModelAndView getAllEmployee(HttpSession session) {
		Employee e=(Employee) session.getAttribute("username");
		
		
		return null;
		
	}

}
