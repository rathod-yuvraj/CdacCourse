package com.demo.test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TestNIOClasses {

	public static void main(String[] args) {
		try {
			//create a path object
		Path p=Paths.get("empcsv.csv");
	    
	    List<String> lst1=Files.readAllLines(p);
	    for(String s:lst1) {
	    	String[] str=s.split(",");
	    	System.out.println(str[0]+"-----"+str[1]+"----"+str[2]);
	    }
	    System.out.println("display employees with salary > 40000");
	    for(String s:lst1) {
	    	String[] str=s.split(",");
	    	if(Double.parseDouble(str[2])>40000) {
	    	      System.out.println(str[0]+"-----"+str[1]+"----"+str[2]);
	    	}
	    }
	    
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in reading");
		}

	}


}
