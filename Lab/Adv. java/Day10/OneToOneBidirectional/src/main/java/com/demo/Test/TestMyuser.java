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

//          MyUser u1 = new MyUser(12,"yuvraj","962123212");
          Address a = new Address(1232,"Pune","pune","431212");
          MyUser u1 = new MyUser(122,"yuvraj","962123212",a);
      
          s.save(u1);
          s.save(a);
          td.commit();
          System.out.println(u1);
          System.out.println(a);
          s.close();
          sf.close();
          
         
          
          
          
	}

}
