package com.demo.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {

	public static void main(String[] args) {
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("myfile.txt"));
			DataInputStream dis=new DataInputStream(new FileInputStream("myfile.txt"))	){
			 dos.writeDouble(3456.67);
			 dos.writeInt(777);
			 dos.writeUTF("Rajan");
			 System.out.println("read data");
			 double num=dis.readDouble();
			 int num1=dis.readInt();
			 String nm=dis.readUTF();
			 System.out.println(num+"----"+num1+"----"+nm);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
