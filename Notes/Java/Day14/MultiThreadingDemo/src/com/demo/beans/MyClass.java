package com.demo.beans;

public class MyClass {
	
	public int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	public void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}
	
	public boolean checkPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

}
