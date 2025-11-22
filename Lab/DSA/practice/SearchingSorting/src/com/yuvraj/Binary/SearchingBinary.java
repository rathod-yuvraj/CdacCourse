package com.yuvraj.Binary;

public class SearchingBinary {
	
	
	
	
	public int BinarySearching(int arr[],int search) {
		
		int low=0;
		int high=arr.length-1;
		while(low<high) {
			int mid=(low+high)/2;
			
			if(arr[mid]==search) {
				return mid;
			}
			if(search<arr[mid]) {
				high=mid-1;
			} else {
				low=mid+1;
			}
			
		}
		return -1;
	}
	
	public int binarySearch(int[] arr,int val) {
		int low=0;
		int high=arr.length;
		while(low<high) {
			int mid=(low+high)/2;
			if(arr[mid]==val) {
				return mid;
			}
			if(val<arr[mid]) {
//			if(arr[mid<val]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return -1;
	}

}
