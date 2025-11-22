package com.yuvraj.arrays;

import java.util.Scanner;

public class My2dArray {

	static int[][] arr;
	public My2dArray() {
		arr=new int[3][3];
	}
	
	public My2dArray(int row,int cols) {
		arr=new int[row][cols];
		
	}
	
//	intert the elements in Array
			public void insertData() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Array: ");
				for(int i=0; i<arr.length;i++) {
					for(int j=0; j<arr.length;j++) {
						System.out.print(i+"---"+j+"\t: ");
						arr[i][j]=sc.nextInt();
						
					}
					}	
			}
			
//		static	public int[] findSumRowWise() {
//				int[] sum=new int[arr[0].length];
//				for(int i=0; i<arr[0].length;i++) {
//					for(int j =0;j<arr.length;j++) {
//						sum[i]+=arr[i][j];
//					}
//				}
//				return sum;
//				
//			}
		static public int[] findSumRowWise() {
			int[] Sum=new int[arr[0].length];
			for(int i=0;i<arr.length; i++) {
				for(int j=0; j<arr[i].length;j++) {
					Sum[i]+=arr[i][j];
				}
			}
			return Sum;
		}
			
			//row wise display
			
			//display the elements in 2d arrays
			public void displayAll() {
				
				for(int i=0; i<arr.length;i++) {
					for(int j=0;j<arr.length;j++) {
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
			}

			public void oneRowdisplay() {
				System.out.println(arr[0].length);
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr[i].length;j++) {
						System.out.print(arr[i].length);
						
					}
				}
			}
			
			
	
}
