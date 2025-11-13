package com.yuvraj.test;
import com.yuvraj.beans.*;
import com.yuvraj.threads.*;
public class TestThreads {

	public static void main(String[] args) {
		PrimeNo p=new PrimeNo();
		Factorial fb=new Factorial();
		StringcountWord sb=new StringcountWord();
		
		MyThreadPrime pth=new MyThreadPrime(7,p);
		
		pth.start();
		MyThreadFactorial fth=new MyThreadFactorial(5,fb);
		fth.start();
		
		MyThreadCountString sth=new MyThreadCountString("IET IS good , institude",sb);
		sth.start();
		 
		

	}

}
