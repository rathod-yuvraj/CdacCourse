package day3;

import java.util.*;

public class test2dArray {
	

	    public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
	        int[][] arr = new int[3][4];
	        

	        int c;
	        do {
	            System.out.println("1. Accept data");
	            System.out.println("2. Display data");
	            System.out.println("3. Sum of all elements");
	            System.out.println("4. Row-wise sum");
	            
	            System.out.println("5. Column-wise sum");
	            System.out.println("7. Identity Maxtrix");
	            System.out.println("10. Exit");
	            System.out.print("Enter your choice: ");
	            c = obj.nextInt();

	            switch(c) {
	                case 1:
	                   Array2dService.acceptData(arr, obj);
	                    break;
	                case 2:
	                   Array2dService.displayData(arr);
	                    break;
	                case 3:
	                    System.out.println("Sum of all elements = " +   Array2dService.addAll(arr));
	                    break;
	                case 4:
	                    int[] rowSum = Array2dService.addRowWise(arr);
	                    System.out.println("Row-wise sums:");
	                    for (int i = 0; i < rowSum.length; i++) {
	                        System.out.println("Row " + i + " = " + rowSum[i]);
	                    }
	                    break;
	                case 5:
	                    int[] colSum =   Array2dService.addColWise(arr);
	                    System.out.println("Column-wise sums:");
	                    for (int j = 0; j < colSum.length; j++) {
	                        System.out.println("Column " + j + " = " + colSum[j]);
	                    }
	                    break;
	                case 6:
	                    System.out.println("Exiting...");
	                    break;
	                case 7:
	                	int [][] arr=Array2dService.CheckIdentity();
	                default:
	                    System.out.println("Invalid choice!");
	            }
	        } while(c != 10);
	    }

	}
	  

