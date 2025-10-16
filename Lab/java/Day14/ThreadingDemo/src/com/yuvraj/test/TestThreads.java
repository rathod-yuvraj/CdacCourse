package com.yuvraj.test;
import com.yuvraj.beans.*;
import com.yuvraj.threads.*;
public class TestThreads {

	public static void main(String[] args) {
		PrimeNo p=new PrimeNo();
		
		MyThreadPrime pth=new MyThreadPrime(7,p);
		
		pth.start();

	}

}
