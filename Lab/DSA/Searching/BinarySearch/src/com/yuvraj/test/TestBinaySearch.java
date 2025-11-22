package com.yuvraj.test;

import com.yuvraj.search.BinarySearchArrays;

public class TestBinaySearch {

	public static void main(String[] args) {
		BinarySearchArrays barr=new BinarySearchArrays();
		barr.insertData(12);
		barr.insertData(12);
		barr.insertData(12);
		barr.delectByValue(12);
//		int pos=barr.BinarySearch(12);
//		if(pos!=-1) {
//			System.out.println("binary search number found at position : "+pos);
//		}else {
//			System.out.println("binary search number not found "+pos);
//		}
		
		barr.display();
		
	}

}
