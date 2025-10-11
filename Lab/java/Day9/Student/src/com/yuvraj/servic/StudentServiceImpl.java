package com.yuvraj.servic;

import com.yuvraj.dao.StudentDao;
import com.yuvraj.dao.StudentDaoImpl;
import com.yuvraj.beans.Student;
import java.util.*;
public class StudentServiceImpl implements StudentService {
	private StudentDao edao;
	
	public StudentServiceImpl() {
		edao=new StudentDaoImpl();
	}

	@Override
	public boolean addNewStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll");
		int rol=sc.nextInt();
		System.out.println("Enter Name:");
		String nam=sc.next();
		System.out.println("Enter the mark1");
		int m1=sc.nextInt();
		System.out.println("Enter the mark2");
		int m2=sc.nextInt();
		System.out.println("Enter Age");
		int ag=sc.nextInt();
		Student s=new Student(rol,nam,m1,m2,ag);
		return edao.save(s);
		
	
	}

	@Override
	public List<Student> displayAll() {
		return edao.findAll();
	}

	@Override
	public Student searchByRoll(int sRoll) {
		
		return edao.findByRoll(sRoll);
	}

	@Override
	public List<Student> searchByName(String name) {
		
		return edao.findByName(name);
	}

}
