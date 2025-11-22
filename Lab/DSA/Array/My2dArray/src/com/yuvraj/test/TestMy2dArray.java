package com.yuvraj.test;

import java.util.Arrays;

import com.yuvraj.arrays.My2dArray;

public class TestMy2dArray {

	public static void main(String[] args) {
		My2dArray a=new My2dArray();
		
		a.insertData();
		System.out.println("Display the 2d array");
		a.displayAll();
		System.out.println("\n\n");
		int[] temp=a.findSumRowWise();
		System.out.println(Arrays.toString(temp));
		a.oneRowdisplay();
	}

}
