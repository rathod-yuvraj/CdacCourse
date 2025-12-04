package com.demo.tests;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.demo.beans.Department;
import com.demo.beans.Employee;

public class TestOneToMany {

	public static void main(String[] args) {
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session session=sf.openSession();
	Transaction td=session.beginTransaction();

	Department d=new Department(101,"HR","Pune");
	
	Employee e=new Employee(1,"yuvraj",LocalDate.of(2025, 12, 30),9999.96,d);
	Employee e1=new Employee(2,"raj",LocalDate.of(1999, 12, 30),80000.56,d);
	Set<Employee> eset=new HashSet<>();

	eset.add(e);
	eset.add(e1);

	session.save(e1);
	session.save(e);
	
	
	
	d.setEset(eset);

	session.save(d);
	

	td.commit();
	session.close();
	sf.close();
			
	}

}
