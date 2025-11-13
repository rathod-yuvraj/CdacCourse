package com.demo.beansArray;

import java.util.Scanner;

public class My2dArrays {

	public static void acceptdata(int[] [] arr) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array:");
		for (int i= 0;i<arr.length;++i) {
			for(int j=0;i<arr[i].length;++j) {
				System.out.println("enter data from row" + i + "data for column" + j);
				arr [i][j] = sc.nextInt();
			}
		}

	}

}
