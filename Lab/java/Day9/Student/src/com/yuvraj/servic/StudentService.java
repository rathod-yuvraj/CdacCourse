package com.yuvraj.servic;

import java.util.List;

import com.yuvraj.beans.Student;

public interface StudentService {

	boolean addNewStudent();

	List<Student> displayAll();

	Student searchByRoll(int sRoll);

	List<Student> searchByName(String name);

}
