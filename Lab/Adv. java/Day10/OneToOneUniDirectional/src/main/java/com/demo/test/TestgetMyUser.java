package com.demo.test;

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
		
		
		MyUser u=session.get(MyUser.class,  324);
		Address a2 =session.get(Address.class, 4);
		td.commit();
		System.out.println(a2);
		System.out.println(u);
		session.close()
;
		sf.close();
		
		
		

	}

}
