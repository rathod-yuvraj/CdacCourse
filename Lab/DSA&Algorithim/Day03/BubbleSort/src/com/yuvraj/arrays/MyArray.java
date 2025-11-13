package com.yuvraj.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray {
	
	private int [] arr;
	private int count;


	public MyArray() {
		arr=new int[10];
		count=0;
	}

	public MyArray(int size) {
		
	       arr=new int[size];
	       count=0;
	       
	}

	public MyArray(int[] arr, int count) {
		this.arr = arr;
		this.count = count;
	}
	public int getCapacity() {
		return arr.length;
		
	}
	public int size() {
		return count;
	}
	public void add() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
	public void add(int value) {
		arr[count]=value;
		count++;
	}
	public void add(int value,int pos) {
		arr[pos]=value;
	}
	 public int searchByValue(int value) {
		 for(int i=0; i<arr.length;i++) {
			 if(arr[i]==value) {
				 return i;
			 }
		 }
		 return -1;
		 
	 }
	 
	 public boolean deleteByValue(int value) {
		 
		 for(int i=0; i<arr.length;i++) {
			 if(arr[i]==value) {
				 arr[i]=-1;
				 return true;
			 }
		 }
		 return false;
		 
	 }
//	 if(pos<count) {
//			for(int i=pos;i<count-1;i++) {
//				arr[i]=arr[i+1];
//			}
//			arr[count-1]=0;
//			count--;
//			return true;
//		}
//		return false;
	 public boolean deleteByPos(int pos) {
		 if(pos<count) {
			 for(int i=pos;i<count-1;i++) {
				 arr[i]=arr[i+1];
			 }
			 arr[count-1]=0;
			 count--;
			 return true;
		 }
		 return false;
		 
		 
	 }

	@Override
	public String toString() {
		return "MyArray [arr=" + Arrays.toString(arr) + "]";
	}
	
	
	
	

}
