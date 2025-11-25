package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validateuser2")
public class demoLoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Show login page if accessed via GET
        RequestDispatcher rd = request.getRequestDispatcher("demologin.html");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "1234".equals(password)) {
            // Successful login → forward to welcome page
            RequestDispatcher rd = request.getRequestDispatcher("welcome.html");
            rd.forward(request, response);
        } else {
            // Failed login → show error + reload login page
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h3 style='color:red;'>Invalid credentials, please try again.</h3>");
            RequestDispatcher rd = request.getRequestDispatcher("demologin.html");
            rd.include(request, response);
        }
    }
}
