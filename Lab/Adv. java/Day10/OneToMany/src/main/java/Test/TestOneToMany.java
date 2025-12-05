package Test;



import java.time.LocalDate;
import java.util.Set;
import java.util.HashSet;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Department;
import beans.Employee;

public class TestOneToMany {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		Department d=new Department(12,"Gaming","Pune");
		Employee e1= new Employee(1,"Rajan",LocalDate.of(2020, 05, 12),356789,d);
		Employee e2= new Employee(2,"Atharva",LocalDate.of(2021, 06, 15),456789,d);
		
		Set<Employee> set1 = new HashSet<Employee>();

		set1.add(e1);
		set1.add(e2);

		d.setEset(set1);
		session.save(d);
		session.save(e1);
		session.save(e2);
		System.out.println(d);
		System.out.println(e1);
		System.out.println(e2);
		tr.commit();
		session.close();
		sf.close();
		
		

	}

}
