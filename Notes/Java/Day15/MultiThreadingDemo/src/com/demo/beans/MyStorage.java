package com.demo.beans;

public class MyStorage {
	private int n;
	private boolean valueSet;
	public MyStorage() {
		super();
		this.n = 0;
		this.valueSet = false;
	}
	
	synchronized public void put(int x) {
		if(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		n=x;
		System.out.println("put: "+n);
		valueSet=true;
		notify();
	}
	
	synchronized public void get() {
		if(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("get: "+n);
		valueSet=false;
		notify();
	}
}
