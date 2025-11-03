package com.yuvraj.test;


import com.yuvraj.arrays.MyStringArray;

public class TestMyStringArray {

	public static void main(String[] args) {
		MyStringArray so=new MyStringArray();
		so.add("rohit");
		so.add("r");
		so.add("hit");
		so.add("rot");
		System.out.println(so);
	int res=so.SeqSearch("yuvraj");
	if(res!=-1) {
		System.out.println("String Are Fount That Index: "+ res);
	}
	else {
		System.out.println("String Are Not Found!");
	}
	

	}

}
