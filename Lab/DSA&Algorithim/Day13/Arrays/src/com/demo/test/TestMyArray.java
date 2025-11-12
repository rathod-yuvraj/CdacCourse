package com.demo.test;

import com.demo.array.MyArray;

public class TestMyArray {


	public static void main(String[] args) {
		MyArray a=new MyArray();
		a.insertData(190);
		a.insertData(26);
		a.insertData(356);
		a.insertData(467);
		a.insertData(55);
		a.insertData(67);
		a.insertData(18);
		a.insertData(184);
		a.insertData(182);
		a.insertData(181);
		a.insertData(186);
		a.display();
		
		a.additionArr(a.arr);
		 int[] sums = a.additionArr(a.arr);
        System.out.println("Digit sums of array elements:");
        for (int s : sums) {
            System.out.print(s + " ");
        }
		

	}

}
