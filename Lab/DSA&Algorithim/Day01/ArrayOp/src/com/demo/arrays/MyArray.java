<<<<<<< HEAD
import java.util.Arrays;

public class MyArray{
	private int[] arr;
	private int count;//non-static
	
	public MyArray() {
		arr = new int [10];
		count = 0;
		
	}
	public MyArray(int [] arr , int count) {
	this.arr=arr;
	this.count=count;
	}
    
	public MyArray(int size) {
		arr = new int[size];
		count=0;
		}
	public int getCapacity() {
		return  arr.length;
		
	}
	
	public int getSize() {
		return count;
	}
	
	//add at given position
	public boolean add(int value,int pos) {
		if(count<arr.length && pos< count ) {
			//shifting on location on right
			for(int i=count;i>pos;i--) {
				arr[i]= arr[i-1];	
				arr[pos] = value;
				count++;
				return true;
		}
			return false;
		
	}	
		//for searching value
		public int searchByValue(int value) {
			for(int i=0;i<count;i++) {
				if (arr)
			}
		}
	
	
}
=======
package com.demo.arrays;

import java.util.Arrays;

public class MyArray {
    private int[] arr;
    private int count; // made non-static

    public MyArray(int[] arr) {
      
        this.count = arr.length;
    }

     public MyArray(int size ) {
    	 
    	 arr = new int [size];
    	 count = 0;
    	 
     }
     public MyArray() {
 		arr=new int[10];
 		count=0;
 	}
     
     public MyArray (int[] arr,int count ) {
    	 
    	 this.arr = arr;
    	 this.count = count;

    	  }
     
     public boolean add(int x) {
    	 
    	 if(count <arr.length) {
    		 arr[count] = x;
    		 count++;
    		 return true;
    	 }
    	 return false;
     }
    		 

 	//add given
 	 public boolean add(int value,int pos ) {
 	 if (count<arr.length && pos<count) {
 		 
 		 //shifting values on right
 		 //at pos loaction
 		 for(int i=count;i>pos;i--)
 		 {
 			 arr[pos]= value;
 			 count ++;
 			 return true;
 			 
 		 }
 		 
 	 }
 	return false;
    	 
    	 
     
     
  } 
 	 
 	 //search by value and return to position
 	 public int searchByValue (int value) {
 		 for (int i= 0;i<count;i++) {
 			 if (arr[i]==value) {
 				 return i;
 			 }
 		 }
 		 return -1;
 	 }
 	public String toString() {
		return "MyArray [arr="+Arrays.toString(arr)+"]";
	}}
   
>>>>>>> dc2fdf40dfa037e0c2f8ab7ae65bf773aaea0d47



