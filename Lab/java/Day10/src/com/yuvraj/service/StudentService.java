package com.yuvraj.service;

import java.util.List;
import java.util.Set;

import com.yuvraj.beans.Student;

public interface StudentService {

	boolean addNewStudent();

	Set<Student> displayAll();

	Student searchById(int roll);

	Set<Student> searchByName(String nm);

	Set<Student> searchByMark(int mk);

	List<Student> sortByName();

	

	

}
