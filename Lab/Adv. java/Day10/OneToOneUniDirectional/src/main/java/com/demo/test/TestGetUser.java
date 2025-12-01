package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.MyUser;

public class TestGetUser {

	public static void main(String[] args) {
	SessionFactory sf =new  Configuration().configure().buildSessionFactory();
	Session session = sf.openSession();
	Transaction td = session.beginTransaction();
	
	
	
	//MyUser u= new MyUser(123,"rohan","9876554321",a1);
	//Address a = new Address(123,"MUBai","123456");
	Address a1 = new Address(23432,"kolkata","272722");
	MyUser u1 = new MyUser(32443,"rogan","976725256",a1);
	Address a2 = new Address(4312,"kolkata","272722");
	MyUser u2 = new MyUser(13423,"rogan","976725256",a1);
	System.out.println("before ");
	session.save(a1);
	session.save(u1);System.out.println("after");
	session.save(a2);
	session.save(u2);
	
	td.commit();
	
	session.close();
	sf.close();
	

	}

}
