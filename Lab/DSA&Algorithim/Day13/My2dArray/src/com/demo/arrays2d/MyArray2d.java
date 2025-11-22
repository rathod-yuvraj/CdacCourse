package com.demo.arrays2d;

public class MyArray2d {
	
	
	
	public void revsRow(int[][] arr) {
		
		for (int i = 0; i < arr.length; i++) {              // iterate over rows
		    for (int j = arr[i].length - 1; j >= 0; j--) {  // iterate backwards over columns
		        System.out.print(arr[i][j] + " ");          // print reversed row
		    }
		    System.out.println();                           // move to next line
		}

	}
	
	public  void revByRow(int[][] arr) {
		
//		arr.length → number of rows.
//
//		arr[0].length → number of columns.
		System.out.println("Rows are printed:");
		for (int i = 0; i < arr[0].length; i++) { // columns
		    for (int j = 0; j < arr.length; j++) { // rows
		        System.out.print(arr[j][i] + " ");
		    }
		    System.out.println(); // move to next line after each column
		}

		
	
		
	}
	public void minOdd(int[][] arr) {
		for(int i=0; i<arr.length;i++) {
			int min=arr[0][0];
			boolean foundodd=false;
			for(int j=0; j<arr[i].length)
		}
	}
	
	public void  maxOdd(int[][] arr) {
		
		for (int i = 0; i < arr.length; i++) {  
		    int maxOdd = Integer.MIN_VALUE;   // start with very small value
		    boolean foundOdd = false;         // flag to check if odd exists

		    for (int j = 0; j < arr[i].length; j++) {
		        if (arr[i][j] % 2 != 0) {     // check if odd
		            foundOdd = true;
		            if (arr[i][j] > maxOdd) {
		                maxOdd = arr[i][j];   // update maximum odd
		            }
		        }
		    }

		    if (foundOdd) {
		        System.out.println("Max odd in row " + i + " = " + maxOdd);
		    } else {
		        System.out.println("Row " + i + " has no odd numbers");
		    }
		}

	}
	
	public  void displayArray(int [][] arr) {
		
		for (int i = 0; i < arr.length; i++) {          // iterate over rows
		    for (int j = 0; j < arr[i].length; j++) {   // iterate over columns in each row
		        System.out.print(arr[i][j] + " ");      // print element
		    }
		    System.out.println();                       // move to next line after each row
		}

		
	}

}
