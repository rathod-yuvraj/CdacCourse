package com.demo.test;

import com.demo.arrays.MyArray;

<<<<<<< HEAD
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
=======
public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         MyArray mb = new MyArray();
         
         mb.add(70);
         mb.add(98);
         mb.add(56);
         mb.add(607);
         mb.searchByValue(10);
         System.out.println(mb);
       
	}

>>>>>>> dc2fdf40dfa037e0c2f8ab7ae65bf773aaea0d47
}
