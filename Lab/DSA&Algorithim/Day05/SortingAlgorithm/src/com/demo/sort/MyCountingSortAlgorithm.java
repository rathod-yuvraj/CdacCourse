package com.demo.sort;

public class MyCountingSortAlgorithm {
	
	
	public static int findMax(int[] arr) {
		int max=arr[0];
		int n=arr.length;
		for(int i=1;i<n;i++) {
			
			if(max<arr[i]) {
				max=arr[i];
				
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,6,5,3,4,7,8,67,34};
	
		
		System.out.println(findMax(arr));
	}

}
