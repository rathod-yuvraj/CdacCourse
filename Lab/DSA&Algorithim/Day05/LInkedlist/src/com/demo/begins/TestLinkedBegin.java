package com.demo.begins;

public class TestLinkedBegin {

	public static void main(String[] args) {
	   
	        LinkedListBegin list = new LinkedListBegin();
	        list.addAtBeginning(10);
	        list.addAtBeginning(20);
	        list.addAtBeginning(30);
	        list.display(); // Output: 30 -> 20 -> 10 -> null
	    }

}
