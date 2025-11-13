package com.yuvraj.arrays;

import java.util.Arrays;

public class MyStringArray {
	private String[] arr;
	private int count;
	public MyStringArray(String[] arr, int count) {
		
		this.arr = arr;
		this.count = count;
	}
	public MyStringArray() {
		arr=new String[10];
		count=0;
	}
	
	public MyStringArray(int size) {
		arr=new String[size];
	}
	
	public void add(String str) {
		arr[count]=str;
		count++;
	}
	public void add (String str, int pos) {
		arr[pos]=str;
		count++;
	}
	
	@Override
	public String toString() {
		return "MyStringArray [arr=" + Arrays.toString(arr) + "]";
	}
	public int SeqSearch(String ser) {
	int n=arr.length;
		
		for(int i=0; i<n;i++) {
			if(arr[i].equals(ser)) {
				return i;
			}
			
		}
		
		return 0;
	}
	
	

}
