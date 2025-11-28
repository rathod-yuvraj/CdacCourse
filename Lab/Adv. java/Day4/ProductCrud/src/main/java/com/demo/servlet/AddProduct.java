package com.demo.servlet;

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
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/AddProduct")
public class AddProduct extends HttpServlet {
	
    public AddProduct() {
        super();
       
    }



	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		doGet(request, response);
		int pid =Integer.parseInt(request.getParameter("pid"));
		String pname = request.getParameter("pname");
		Double qty =Double.parseDouble(request.getParameter("qty"));
		Double price = Double.parseDouble(request.getParameter("price"));
//		String dt = request.getParameter("expdate");
//		LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		int cid = Integer.parseInt(request.getParameter("cid"));//this is customer id
		Product p= new Product (pid,pname,qty,price,cid) ;
		ProductService pservice = new ProductServiceImpl();
		boolean status = pservice.addProduct(p);
		
		RequestDispatcher rd = request.getRequestDispatcher("ShowProduct");
		rd.forward(request,response);
		
		
		
		
		
	}

}
