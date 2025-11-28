package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.MyUser;
import com.dom.service.LoginService;
import com.dom.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet( "/validateUser")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");//converted in html tag
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String pass = request.getParameter("password");
		LoginService lservice = new LoginServiceImpl();
		MyUser user=lservice.valideUser(username,pass);
//		|| ("admin".equals(username) && "1234".equals(pass))
		if (user != null ) {
		   out.print("<h1> valid user</h1>");
		}else {
			  out.print("<h1> Not valid user</h1>");
			  RequestDispatcher rd=request.getRequestDispatcher("login.html");
			  rd.include(request, response);
			  
			  /*
			   * 
			   * out.print("<h1>Invalid credentials</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.include(request, response);
			   * */
		}

		 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	        throws ServletException, IOException {
	    
	    response.setContentType("text/html");
	    String username = request.getParameter("username");
	    String password = request.getParameter("password");

	    LoginService lservice = new LoginServiceImpl();
	    MyUser user = lservice.valideUser(username, password);

	    if (user != null) {
	        // Forward to welcome page or dashboard
	    	PrintWriter out=response.getWriter();
	    	 out.print("<h1> valid user</h1>");
	    	
//	        RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
//	        rd.forward(request, response);
	    } else {
	        // Set error message in request scope
	        request.setAttribute("errorMessage", "Invalid credentials, please try again.");
	        RequestDispatcher rd = request.getRequestDispatcher("login.index");
	        rd.forward(request, response);
	    }
	}


}
