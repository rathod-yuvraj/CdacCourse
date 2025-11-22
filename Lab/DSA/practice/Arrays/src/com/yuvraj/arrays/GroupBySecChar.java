package com.yuvraj.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class GroupBySecChar {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String [] arr=new String[20];
		int count=0;
		while(count<20) {
			System.out.println("Enter String : ");
			String s=sc.next();
			char sec=s.charAt(1);
			int pos=count;
			for(int i=0;i<count;i++) {
				if(arr[i].charAt(1)==sec) {
					pos=i+1;
				}
			}
			for(int j=count;j>pos;j--) {
				arr[j]=arr[j-1];
			}
			arr[pos]=s;
			count++;
		
		
System.out.println(Arrays.toString(arr));
		}
		sc.close();
	}

}
