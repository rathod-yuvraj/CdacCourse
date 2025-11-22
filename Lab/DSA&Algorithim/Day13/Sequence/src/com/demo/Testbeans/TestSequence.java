package com.demo.Testbeans;
import com.demo.beans.*;



public class TestSequence 
{

	public static void main(String[] args) {
		int[] arr= {10,5,4,7,8,3,2,15};
		
		int pos = S.sequenceSearch(arr, 7);
		if(pos!=-1) {
			System.out.println("number found at position : "+pos);
		    }else {
			System.out.println("not found");
		      }
	}
}
