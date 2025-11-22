package com.demo.test;

import com.demo.arrays2d.MyArray2d;

public class TestMyArray2d {

	public static void main(String[] args) {
	MyArray2d a=new MyArray2d();
	
		
		
		int[][] arr = {
			    {1, 2, 3, 4},
			    {5, 6, 7, 8},
			    {9, 10, 11, 12}
			};


		
		a.displayArray(arr);
		System.out.println("\n\n\n\n\n\n");
		a.revByRow(arr);
		a.maxOdd(arr);
	}

}
