package com.demo.servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Product;



/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/AddProduct")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int pid = Integer.parseInt( request.getParameter("pid"));
		String pname =  request.getParameter("pname");
		int qty = Integer.parseInt( request.getParameter("qty"));
		double price = Double.parseDouble( request.getParameter("price"));
		String dt =  request.getParameter("expdate");
		LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		int cid = Integer.parseInt( request.getParameter("cid"));
		Product p =new Product(pid,pname,qty,price,ldt,cid);
		
		
		RequestDispatcher rd=request.getRequestDispatcher("showproduct");
		rd.forward(request, response);
		
	}

}
