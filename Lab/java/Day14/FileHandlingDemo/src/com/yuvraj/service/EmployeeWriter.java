package com.yuvraj.service;

import java.util.List;
import java.io.*;
import com.yuvraj.beans.Employee;

public class EmployeeWriter {


	

	    public void writeEmployees(String filePath, List<Employee> employees) {
	        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
	            for (Employee e : employees) {
	                bw.write(e.toString());
	                bw.newLine();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}



