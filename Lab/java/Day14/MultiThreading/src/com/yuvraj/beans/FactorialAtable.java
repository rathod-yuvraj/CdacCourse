package com.yuvraj.beans;

public class FactorialAtable {

	 public int factorial(int n) {
		 int fact=1;
		 for(int i=1;i<n;i++) {
			 fact+=fact*i;
			 
		 }
		 return fact;
	 }
	 
	 public void printTable(int n) {
		 
		 for(int i=1;i<10;i++) {
			 System.out.println("Table : "+i+"*"+n+"--"+(i*n));
		 }
	 }
	 public void printTable17(int n) {
		 for(int i=1;i<10;i++) {
			 System.out.println("Table: "+i+"*"+"--"+(i*n));
		 }
	 }
}
