package com.yuvraj.arrays;

import java.util.Scanner;
import java.util.Scanner;

public class My2dArray {
    private int[][] arr;

    // Constructor with rows and columns
    public My2dArray(int rows, int cols) {
        arr = new int[rows][cols];
    }

    // Default constructor
    public My2dArray() {
        arr = new int[3][3];
    }

    // Method to accept data from user
    public void acceptData() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    // Method to display the array
    public void displayArray() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    //sum of matrix row Wise
    public int[] findSumRowwise() {
		int[] sumrows=new int [arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				sumrows[i]+=arr[i][j];
			}
			
		}
		return sumrows;
	}
	public int [] findSumColumns() {
		int[] sumcol=new int [arr.length];
		
		for(int i=0; i<arr[0].length;i++) {
			for(int j=0; j<arr.length;j++) {
				sumcol[i]+=arr[i][j];
			}
		}
		return sumcol;
		
	}
    
    
}

	
	

