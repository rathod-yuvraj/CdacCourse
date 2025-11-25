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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Show login page if accessed via GET
        RequestDispatcher rd = request.getRequestDispatcher("html/Login.html");
        rd.forward(request, response);
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	

	String uname =request.getParameter("uname");
	String pass =request.getParameter("pass");
	LoginService lservice=new LoginServiceImpl();
	MyUsers user=lservice.validateUser(uname,pass);
	 if ("admin".equals(uname) && "1234".equals(pass) || user != null) {
         // Successful login → forward to welcome page
         RequestDispatcher rd = request.getRequestDispatcher("welcome.html");
         rd.forward(request, response);
     } else {
    	 
    	 
         // Failed login → show error + reload login page
//         response.setContentType("text/html");
//         PrintWriter out = response.getWriter();
         out.println("<h3 style='color:red;'>Invalid credentials, please try again.</h3>");
         RequestDispatcher rd = request.getRequestDispatcher("html/Login.html");
         rd.include(request, response);
    	 
    	 
    	 
//	 if(user != null)
//	 {
//	 //store user in session
//	 HttpSession session= request.getSession();
//	 session.setAttribute("user",user);
//	 RequestDispatcher rd =request.getRequestDispatcher("html/home.html");
//	 rd.forward(request, response);
//	 }else
//	 {
//		out.println("<h5>Invalid credential</h5>");
//		RequestDispatcher rd =request.getRequestDispatcher("html/Login.html");
//   	    rd.include(request, response);
//		
	 }
	
		
	}

}
