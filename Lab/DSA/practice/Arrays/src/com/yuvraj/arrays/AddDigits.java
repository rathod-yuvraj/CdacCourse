package com.yuvraj.arrays;

public class AddDigits {
	
	public void add(int[] arr) {
		for(int num :arr) {
			int sum=0;
			int temp=num;
			while(temp>0) {
				sum=sum+temp%10;
				temp=temp/10;
			}
			System.out.println("digits sum of "+"= "+sum);
			
		}
	}
	
	public static void main(String [] args) {
		int[] arr= {1,43,65,322,98};
		AddDigits a=new AddDigits();
		a.add(arr);
	}

}
