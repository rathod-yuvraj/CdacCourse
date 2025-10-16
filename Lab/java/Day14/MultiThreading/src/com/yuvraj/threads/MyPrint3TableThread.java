package com.yuvraj.threads;

import com.yuvraj.beans.FactorialAtable;

public class MyPrint3TableThread extends Thread {
	private int n;
	private FactorialAtable ob;
	public MyPrint3TableThread(int n, FactorialAtable ob) {
		super();
		this.n = n;
		this.ob = ob;
	}
	public void run() {
		
		ob.printTable(n);
		
	}

}
