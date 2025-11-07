package com.demo.test;

import com.demo.arrays.MyArray;

public class TestArray{
	
	public static void main(String[] args ) {
		MyArray ob = new MyArray();
		System.out.println("capacity:"+ob.getCapacity());
		
		ob.add(4);
		ob.add(7);
		System.out.println(ob);
		ob.add(8,1);
		System.out.println(ob);
		System.out.println("position of 10 : "+ob.searchByValue(10));
		ob.add(3);
		ob.add(5);
		System.out.println(ob);
		

		
		
				
	}
}
