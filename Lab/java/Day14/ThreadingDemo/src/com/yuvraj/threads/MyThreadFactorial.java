package com.yuvraj.threads;

import com.yuvraj.beans.Factorial;

public class MyThreadFactorial extends Thread {

	
	private int n;
	private Factorial fb;
	public MyThreadFactorial(int n, Factorial fb) {
		super();
		this.n = n;
		this.fb = fb;
	}
	public void run() {
	int ans=fb.isfactorial(n);
	System.out.println("Factorial : "+n+" Is : "+ans);
	}
}
