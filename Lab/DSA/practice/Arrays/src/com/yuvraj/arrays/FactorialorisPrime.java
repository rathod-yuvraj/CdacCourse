package com.yuvraj.arrays;

public class FactorialorisPrime {
	
	public static boolean isPrime(int num) {
		
		if(num<2) {
			return false;
			
		}
		for(int i=0 ;i<=num/2;i++) {
			if(num%i==0) {
				return false;
				
			}
			
		}
		
		return true;
		
	}
	
	public static long fact(int n) {
		long f=1;
		for(int i=1; i<=n;i++) {
			f*=i;
			
		}
		return f;
	}

	
	public static void main(String[] main) {
		FactorialorisPrime f=new FactorialorisPrime();
		int[] arr= {23,5,43,2,1,4,5,6,7,8};
		for(int num:arr) {
			if(isPrime(num)) {
				System.out.println("Prime: "+ num+ " "+"Factorial "+fact(num));
			}
		}
	}
}
