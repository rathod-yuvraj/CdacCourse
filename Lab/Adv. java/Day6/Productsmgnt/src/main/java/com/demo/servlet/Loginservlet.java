package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.MyUsers;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

@WebServlet("/validateuser")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Loginservlet() {
      
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	

	String uname =request.getParameter("uname");
	String pass =request.getParameter("pass");
	LoginService lservice=new LoginServiceImpl();
	MyUsers user=lservice.validateUser(uname,pass);
	 if(user != null)
	 {
	 //store user in session
	 HttpSession session= request.getSession();
	 session.setAttribute("user",user);
	 RequestDispatcher rd =request.getRequestDispatcher("category");
	 rd.forward(request, response);
	 }else
	 {
		out.println("<h5>Invalid credential</h5>");
		RequestDispatcher rd =request.getRequestDispatcher("html/Login.html");
   	    rd.include(request, response);
		
	 }
	
		
	}

}
