package com.yuvraj.service;

import java.util.Scanner;
import java.util.Set;

import com.yuvraj.beans.Student;
import com.yuvraj.dao.StudentDao;
import com.yuvraj.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao edao;


	

	public StudentServiceImpl() {
		edao=new StudentDaoImpl();
	}
	

	  @Override
	  public boolean addNewStudent() {
	  	Scanner sc = new Scanner(System.in);
	  	System.out.println("Enter id");
	  	int id =sc.nextInt();
	  	System.out.println("Enter name ");
	  	String nm=sc.next();
	  	System.out.println("Enter mark");
	  	int mark=(int) sc.nextDouble();
	  	
	 
	  	Student e=new Student(id,nm,mark);
	  	
	  	return edao.save(e);
	  }

	  @Override
	  public Set<Student> displayAll() {
	  	
	  	return edao.findAll();
	  }

}