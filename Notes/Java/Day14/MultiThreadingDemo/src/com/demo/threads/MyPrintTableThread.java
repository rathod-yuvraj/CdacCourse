package com.demo.threads;

import com.demo.beans.MyClass;

public class MyPrintTableThread extends Thread{
   private int n;
   private MyClass ob;
   
	
	public MyPrintTableThread(int n, MyClass ob) {
	super();
	this.n = n;
	this.ob = ob;
}


	public void run() {
		ob.printTable(n);
	}
}
