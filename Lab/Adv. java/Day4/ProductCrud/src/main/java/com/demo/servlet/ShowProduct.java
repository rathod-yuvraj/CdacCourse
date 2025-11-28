package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;


@WebServlet("/ShowProduct")
public class ShowProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

 public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ProductService pservice=new ProductServiceImpl();
		List<Product> plist=pservice.getAllProduct();
		
		out.println("<table border='2'><tr><th>Id</th><th>Name</th><th>qty</th><th>price</th><th>expdate</th><th>cid</th><th>action</th></tr>");
		for(Product p:plist) {
			out.println("<tr><td>"+p.getPid()+"</td><td>"+p.getPname()+"</td><td>"+p.getQty()+"</td><td>"+p.getPrice()+"</td><td>"+"</td><td>"+p.getCid()+"</td>");
			out.println("<td><a href='deleteproduct?pid="+p.getPid()+"'>delete</a>/<a href='editproduct?pid="+p.getPid()+"'>edit</a></td></tr>");
		}
		out.println("</table>");
		out.println("<a href='addproduct.html'>Add new product</a>");
	
	}

}
