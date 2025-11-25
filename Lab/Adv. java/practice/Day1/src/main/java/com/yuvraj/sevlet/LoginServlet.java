package com.yuvraj.sevlet;

import jakarta.servlet.AsyncListener;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionActivationListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingListener;
import jakarta.servlet.http.HttpSessionIdListener;
import jakarta.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class LoginServlet
 *
 */
@WebListener
public class LoginServlet implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener, HttpSessionAttributeListener, HttpSessionActivationListener, HttpSessionBindingListener, HttpSessionIdListener, ServletRequestListener, ServletRequestAttributeListener, AsyncListener {

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }
	
}
