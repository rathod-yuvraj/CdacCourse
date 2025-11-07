package com.demo.test;

import java.io.*;

public class TestFileStream {
	  
	public static void fileReading() {
		
		try(FileInputStream fi=new FileInputStream("myfile.txt")){
			
			int data;
			System.out.println("File Data: ");
			while((data=fi.read())!=-1) {
				System.out.print((char) data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		String data="This code Are only file handling ";
		
		try( FileOutputStream fs=new FileOutputStream("myfile.txt")){
			
			fs.write(data.getBytes());
			System.out.println("File are created and write data successfully!");
		
			
		} catch (FileNotFoundException e) {
			
			System.out.println("File are not found"+e.getMessage());

		} catch (IOException e) {
			
			System.out.println("I/O Error"+e.getMessage());

		}finally {
			System.out.println("write operations completely");
		}
		fileReading();
	}

}
