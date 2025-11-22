package com.yuvraj.array;

import java.util.Arrays;

public class MyArray {
	static int[] arr;
	int cnt=0;
	public MyArray(int[] arr, int cnt) {
		super();
		this.arr = arr;
		this.cnt = cnt;
	}
	public MyArray(int size) {
		
		this.arr =new int[size];
		cnt=0;
		
	}
	public MyArray() {
		arr=new int[10];
		cnt=0;
		
	}
//	my code 
	
	
	//add at the end
	public boolean add(int val) {
		if(cnt<arr.length) {
				arr[cnt]=val;
	         cnt++;
			return true;
		}
		
		return false;
	}
	
	//add at given positions
	
	public boolean add(int pos,int val) {
//		if(cnt<arr.length) {
//       for(int i=cnt;i>pos;i--){
		
//		arr[i]=arr[i-1];
//	}
//			arr[pos]=val;	
//		cnt++;
//		return true;
//		}
//		
//		return false;
//}
		if(cnt<arr.length && pos<cnt) {
			//shifting values one location on the rigth side and make place 
			//at pos location
			for(int i=cnt;i>pos;i--) {
				arr[i]=arr[i-1];
		    }
			//adding value at pos position
			arr[pos]=val;
			cnt++;
			return true;
		}
		return false;
		
		
	}
//	Search by given positions sequential search
	public int searchByVal(int val) {
		
		for(int i=0; i<cnt;i++) {
			if(arr[i]==val) {
				return i;
				
			}
			
		}
		return -1;
		
		
		
	}
	
//	search by binary search
	public int SearchByBinary(int[]arr,int val,int low,int high) {
		
		if(low<high) {
			int mid=(low+high)/2;
			if(arr[mid]==val) {
				return mid;
				
			}
			else if(val>arr[mid]) {
			
			
//			else if(arr[mid]<val) {
				return SearchByBinary(arr,val,low,mid+1);
			}else {
				return SearchByBinary(arr,val,mid-1,high);
			}
		} 
		
		return -1;
	}
	
	
//	searching by non recursive binary search
	public int searchNonrecursive(int[] arr,int val) {
		int low=0;
		int high=arr.length-1;
		int cnt1=0;
		while(low<=high) {
			int mid=(low+high)/2;
			cnt1++;
			if(arr[mid]==val) {
				return mid;
			}
			
			if(val<arr[mid]) {
//			if(arr[mid]<val){
				high=mid-1;
				
			} else {
				low=mid+1;
			}
				
		}
		return -1;
	}
	
	
	
	
//	insert the element in array
	public void  inserData(int val) {
		arr[cnt]=val;
		cnt++;
	
	}
//	searching
	
//	delete by value
	public boolean deleteByVal(int val) {
		
		int idx=searchByValue(val);
		if(idx!=-1) {
			return deleteByPos(idx);
		}
		
		return false;
		
		
		
	}
	
	private int searchByValue(int val) {
	for(int i=0 ;i<arr.length;i++) {
		if(arr[i]==val) {
			System.out.println("position:  "+i+" val are "+" --- "+val);
			return 1;
		}
		
	}
	System.out.println("Not found");
	return 0;
}
	
//	delete given by positions
	
	private boolean deleteByPos(int idx) {
		
		
	return false;
}
	
	
//	count the element in how many time occurece
//	public int cnteleArray() {
//		int sum=0;
//		int[] idx =new int[5];
//		
//		for(int i=0;i<arr.length;i++) {
//			idx[i]=sum;
//			for(int j=arr.length;j>0;j--) {
//			if(arr[i]==arr[j]) {
//				sum++;
//			}
//			}
//		}
//		return sum;
//		
//	}
	public static void main(String[] args) {
		MyArray a=new MyArray();
	
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println(Arrays.toString(arr));
	
	}
	
	

}
