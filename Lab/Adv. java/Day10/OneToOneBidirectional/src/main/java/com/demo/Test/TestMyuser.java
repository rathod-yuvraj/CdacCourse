package com.demo.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMyuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          SessionFactory sf=new Configuration().configure().buildSessionFactory();
          Session s=sf.openSession();
          Transaction td=s.beginTransaction();
          
	}

}
