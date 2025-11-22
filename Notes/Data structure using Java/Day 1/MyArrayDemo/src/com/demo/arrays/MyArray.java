package com.demo.arrays;

import java.util.Arrays;

public class MyArray {
	private int[] arr;
	private int index;
	
	public MyArray() {
		arr=new int[10];
		index=0;
	}
	
	public MyArray(int[] arr,int index) {
		this.arr=arr;
		this.index=index;
	}
	
	public MyArray(int size) {
		arr=new int[size];
		index=0;
	}
	
	public int getCapacity() {
		return arr.length;
	}
	
	public int getSize() {
		return index;
	}
	
	//add at the end
	public boolean add(int x) {
		if(index<arr.length) {
		   arr[index]=x;
		   index++;
		   return true;
		}
		return false;
	}
	
	//ad at the given position
	public boolean add(int value,int pos) {
		if(index<arr.length && pos<index ) {
			//shifting values one location on the rigth side and make place 
			//at pos location
			for(int i=index;i>pos;i--) {
				arr[i]=arr[i-1];
		    }
			//adding value at pos position
			arr[pos]=value;
			index++;
			return true;
		}
		return false;
		
		
	}
	
	//search the value and return its position
    public int searchByValue(int value) {
    	for(int i=0;i<index;i++) {
    		if(arr[i]==value) {
    			return i;
    		}
    	}
    	return -1;
    	
    }
    
    //delete the value at the given position
	public boolean deleteByPos(int pos) {
		if(pos<index) {
			for(int i=pos;i<index-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[index-1]=0;
			index--;
			return true;
		}
		return false;
	}
	
	//delete first occurrence of the given value
	public boolean deleteByValue(int value) {
		int idx=searchByValue(value);
		if(idx!=-1) {
			return deleteByPos(idx);
		}
		return false;
	}
	
	//flag=true then rotate right num times
	//flag=false the rotate left num times 
	public void rotateArray(boolean flag,int num) {
		if(flag) {
			//right rotation
			for(int cnt=0;cnt<num;cnt++) {
				int temp=arr[index-1];
				for(int i=index-1;i>0;i--) {
					arr[i]=arr[i-1];
				}
				arr[0]=temp;
			}
		}else{
			//left rotation
			for(int cnt=0;cnt<num;cnt++) {
				int first=arr[0];
				for(int i=0;i<index-1;i++) {
					arr[i]=arr[i+1];
				}
				arr[index-1]=first;
			}
		}
		
	}
	//if flag=true then reverse inplace
	//else reverse the copy of array
	public int[] reverseArray(boolean flag) {
		if(flag) {
			for(int i=0,j=index-1;i<j;i++,j--) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			return arr;
		}else {
			int[] arr1=new int[index];
			for(int i=index-1,j=0;i>=0;i--,j++) {
				arr1[j]=arr[i];
			}
			return arr1;
		}
		
	}
	
	public int findMax() {
		int max=arr[0];
		for(int i=1;i<index;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	
	//replace index with values in the array
	//assumption--> array elements are not -ve
	public int[] exchangeIndexValue() {
		//find maximum number
		int max=findMax();
		//allocate memory for arr1 which is max+1
		int[] arr1=new int[max+1];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=-1;
		}
		//exchange index with value
		for(int i=0;i<index;i++) {
			int idx=arr[i];
			int value=i;
			arr1[idx]=value;
		}
		return arr1;
	}
	
	//find sum of all values
	public int findSum() {
		int sum=0;
		for(int i=0;i<index;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	
	
	public String toString() {
		return "MyArray [arr="+Arrays.toString(arr)+"]";
	}
	
	
	

}
