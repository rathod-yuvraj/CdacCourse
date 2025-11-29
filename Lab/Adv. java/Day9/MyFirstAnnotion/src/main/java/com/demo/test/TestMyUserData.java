package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.MyUser;


public class TestMyUserData {
	
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		MyUser u1=new MyUser(300,"yuvraj","rrrr@gmail.com");
		MyUser u2=new MyUser(310,"Rathod","aaa@gmail.com");
		
		session.save(u1);
		session.save(u2);
		
		tr.commit();
		session.close();
		sf.close();
	}

}
