package com.demo.dao;

import java.util.HashSet;
import java.util.Set;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Project;


public class ProjectDaoImpl implements ProjectDao {
static SessionFactory sf=null;

       static {
    	   sf=HibernateUtil.getMySessionFactory();
       }


	@Override
	public void save(ProjectDao p) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(p);
		
		tr.commit();
		session.close();
		
		
	}

	@Override
	public Set<ProjectDao> findbypid(String[] parr) {
		// TODO Auto-generated method stub
		Set <ProjectDao> pset=new HashSet<>();
		Session session = sf.openSession();
		Transaction tr =  session .beginTransaction();
		for (String pid:parr) {
			Project p=session.get(Project,class,Integer.parseInt(pid));
			pset.add(p);
			
		}
		tr.commit();
		session.close();
		
		return past;
	}

	@Override
	public Project findbypid(int pid) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		Project p =session.get(Project class,pid);
		
		
		
		return null;
	}

	
	
}
