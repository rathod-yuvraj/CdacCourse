package com.yuvraj.search;

import java.util.Arrays;


public class BinarySearchArrays {
	int[] arr;

	int index=0;
	
	public BinarySearchArrays() {
		
		this.arr = new int[10];
		
	}
	public BinarySearchArrays(int size) {
		super();
		this.arr = new int[size];
	}
//	insert element in ARRAY
	public void insertData(int num) {
	  arr[index]=num;
	  index++;
		
	}
	
//	binarySearch
	

	
	
	public void display() {
		System.out.println(Arrays.toString(arr));
	}
	public int BinarySearch(int search) {

		int low=0;
		int high=arr.length-1;
		int cnt=0;
		while(low<=high) {
			int mid=(low+high)/2;
			cnt++;
			if(arr[mid]==search) {
				System.out.println("comparisons are : "+cnt);
				return mid;
			}
			if(search<arr[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		System.out.println("comparisons are : "+cnt);
		return -1;
		
	}
	
	
//	delect by value
	
	public void delectByValue(int val) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==val) {
				index--;
				
			} else {
				System.out.println("Not Found");
			}
			
		}
		
		
		
		
	}

}
