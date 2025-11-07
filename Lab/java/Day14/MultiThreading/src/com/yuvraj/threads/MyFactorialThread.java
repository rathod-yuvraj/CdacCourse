package com.yuvraj.threads;

import com.yuvraj.beans.FactorialAtable;

public class MyFactorialThread extends Thread {
	private int n;
	private FactorialAtable ob;
	public MyFactorialThread(int n, FactorialAtable ob) {
		super();
		this.n = n;
		this.ob = ob;
	}
	public void run() {
		int ans=ob.factorial(n);
		System.out.println("Factorial: "+ans);
	}

}
