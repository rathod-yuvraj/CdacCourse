package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/validateuser1")
public class demologin extends HttpServlet {
//	@Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	    response.setContentType("text/html");
//	    PrintWriter out = response.getWriter();
//	    out.println("<h3>This servlet only supports POST for login.</h3>");
//	    RequestDispatcher rd = request.getRequestDispatcher("Login.html");
//	    rd.include(request, response);
//	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    RequestDispatcher rd = request.getRequestDispatcher("html/Login.html");
	    rd.forward(request, response);
	}



}
