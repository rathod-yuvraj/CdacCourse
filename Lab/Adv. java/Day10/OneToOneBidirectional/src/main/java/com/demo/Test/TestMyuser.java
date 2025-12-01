package com.demo.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.MyUser;

public class TestMyuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          SessionFactory sf=new Configuration().configure().buildSessionFactory();
          Session s=sf.openSession();
          Transaction td=s.beginTransaction();
          
          
          Address a = new Address(1234);
          MyUser u = new MyUser();
          
          
          
	}

}
