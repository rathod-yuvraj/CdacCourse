package com.yuvraj.threads;

import com.yuvraj.beans.PrimeNo;

public class MyThreadPrime extends Thread {
	
	private int n;
	private PrimeNo op;
	public MyThreadPrime(int n, PrimeNo op) {
		super();
		this.n = n;
		this.op = op;
	}
	public void run() {
		
		
		boolean ans=op.isPrime(n);
		if(ans) {
			System.out.println(n+" Is Prime Number");
		}else {
			System.out.println(n+ " Is Not Prime Number");
		}
	}

}
