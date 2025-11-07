package com.demo.test;
import java.io.*;
public class TestFile {

	public static void main(String[] args) {
		
		File fs=new File("demo.txt");
		try {
			if(fs.createNewFile()) {
				System.out.println("File Created Successfully");
				
			} 
			else {
				System.out.println(" File exits");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error"+e.getMessage());
		}
		

	}

}
