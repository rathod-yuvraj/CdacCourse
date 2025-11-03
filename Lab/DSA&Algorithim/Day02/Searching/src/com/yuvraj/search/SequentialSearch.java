package com.yuvraj.search;

public class SequentialSearch {
	
	public static int sequentialSearch(int[] arr,int x ) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		
		int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int x = 10;
        int result = sequentialSearch(arr, x);
        if (result != -1)
            System.out.println("Element is present at index " + result);
        else
            System.out.println("Element is not present in array");
    }
	

}
