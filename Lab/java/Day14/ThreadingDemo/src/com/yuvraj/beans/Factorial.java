package com.yuvraj.beans;

public class Factorial {
	
	public int isfactorial(int n) {
		int fact=1 ;
		for(int i=0;i<n;i++) {
			fact+=fact*i;
		}
		return fact;
	}

}
