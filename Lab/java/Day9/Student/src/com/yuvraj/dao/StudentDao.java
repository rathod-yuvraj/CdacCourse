package com.yuvraj.dao;

import java.util.List;

import com.yuvraj.beans.Student;

public interface StudentDao {

	boolean addNewStudents();

	boolean save(Student s);

	List<Student> findAll();

	Student findByRoll(int sRoll);

	List<Student> findByName(String name);

}
