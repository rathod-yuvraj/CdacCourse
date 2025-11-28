package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.MyUser;
import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

/**
 * Servlet implementation class ShowProduct
 */
@WebServlet("/showproduct")
public class ShowProduct extends HttpServlet {



	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	HttpSession s=request.getSession();
	MyUser user= (MyUser) s.getAttribute("user");
	if(user!=null && user.getRole().equals("Admin")) {
		ProductService pservice=new ProductServiceImpl();
		List<Product>plist=pservice.getAllProduct();
		request.setAttribute("plist", plist);
		RequestDispatcher rd=request.getRequestDispatcher("ShowProduct.jsp");
		rd.forward(request, response);
		
	}else {
		out.print("<h1> Invalid credential</h1>");
		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		rd.include(request, response);
	}
		
	}
	

}
