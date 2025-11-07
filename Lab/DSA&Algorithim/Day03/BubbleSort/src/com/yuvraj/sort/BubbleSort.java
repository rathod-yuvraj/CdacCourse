package com.yuvraj.sort;

import java.util.Arrays;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length-i;j++) {
				if(arr[j-1]<arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
				}
			}
			System.out.println("Bubble sort Iterations: " +i);
			System.out.println(Arrays.toString(arr));
		}
	}

	
	
	
}
