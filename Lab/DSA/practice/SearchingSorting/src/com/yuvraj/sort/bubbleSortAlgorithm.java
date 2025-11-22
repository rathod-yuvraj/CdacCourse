package com.yuvraj.sort;

import java.util.Arrays;

public class bubbleSortAlgorithm {
	
	public void bubbleSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[j-1]>arr[j]) {
					
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
				}
			}
			System.out.println("comparism "+ i);
			System.out.println(Arrays.toString(arr));
		}
		
	}
	
	
	public void bubbleSortImpro(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			boolean flag=false;
			for(int j=1;j<arr.length-1;j++) {
				if(arr[j-1]>arr[j]) {
					flag=true;;
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				
			}
			
			if(!flag) {
				break;
			}
			System.out.println("i" + i);
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
