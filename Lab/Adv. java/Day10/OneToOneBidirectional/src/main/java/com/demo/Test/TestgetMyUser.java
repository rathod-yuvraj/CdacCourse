package com.demo.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.MyUser;

public class TestgetMyUser {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction td=session.beginTransaction();
		


		// Fetch user with id=122
		MyUser user = session.get(MyUser.class, 122);
		System.out.println("User: " + user.getName());
		System.out.println("User's Address: " + user.getAddr().getStreet());

		// Fetch address with id=1232
		Address addr = session.get(Address.class, 1232);
		System.out.println("Address: " + addr.getStreet());
		System.out.println("Belongs to User: " + addr.getUser1().getName());

		td.commit();
		session.close();
		session.close();
		sf.close();
		
		
	}

}
