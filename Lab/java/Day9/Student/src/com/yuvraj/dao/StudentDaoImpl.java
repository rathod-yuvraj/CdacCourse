package com.yuvraj.dao;

import java.util.ArrayList;
import java.util.List;

import com.yuvraj.beans.Student;

public class StudentDaoImpl implements StudentDao {
	static List <Student> lst;
	
	static {
		lst=new ArrayList<>();
		lst.add(new Student(101,"Rohit",85,26));
		lst.add(new Student(102,"Rohan",58,23));
		lst.add(new Student(103,"Rahul",55,22));
		lst.add(new Student(104,"Ron",58,16));
		lst.add(new Student(105,"Rohini",58,28));
		lst.add(new Student(106,"Rohit",58,100));
	}

	@Override
	public boolean save(Student s) {
		lst.add(s);
		return true;
		
	}

	

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return lst;
	}




	@Override
	public Student findByRoll(int roll) {
		
		int pos=lst.indexOf(new Student(roll));
		if(pos!=-1) {
			return lst.get(pos);
		}
		return null;
	
		
	}



	@Override
	public List<Student> findByName(String name) {
		
		return null;
	}





}
