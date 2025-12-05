package com.demo.test;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;

public class TestAddEmployee {

	public static void main(String[] args) {
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session session=sf.openSession();
	Transaction td=session.beginTransaction();
//	Employee e=new Employee(1,"abc",LocalDate.of(2021, 10, 30),234424.00);
	Employee e5=new Employee("abc",LocalDate.of(2021, 10, 30),234424.00);
	Employee e1=new Employee("bcd",LocalDate.of(2021, 10, 30),234424.00);
	Employee e2=new Employee("dcf",LocalDate.of(2021, 10, 30),234.00);
	Employee e3=new Employee("sai",LocalDate.of(2021, 10, 30),2058.00);
	Employee e4=new Employee("saket",LocalDate.of(2021, 10, 30),9998.00);
//	session.save(e);
	session.save(e5);
	session.save(e1);
	session.save(e2);
	session.save(e3);
	session.save(e4);
	
	td.commit();
	session.clear();
	sf.close();
	
	
	}

}
