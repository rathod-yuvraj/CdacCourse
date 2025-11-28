package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.demo.beans.MyUser;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

@WebServlet("/validate")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String pass = request.getParameter("password");

		// validate the user
		LoginService lservice = new LoginServiceImpl();
		MyUser user = lservice.validateuser(username, pass);

		if (user != null) {
			out.print("<h1>valid user<h1>");
			// save user in session
			HttpSession session = request.getSession();
//			session.setAttribute("user", username);
			  session.setAttribute("user", user); 

			RequestDispatcher rd = request.getRequestDispatcher("showproduct");
			rd.forward(request, response);

			out.print("<h1>valid user<h1>");
		} else {

			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);

			out.print("<h1>invalid user<h1>");
		}

	}

}
