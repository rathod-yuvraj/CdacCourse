package com.yuvraj.test;

import com.yuvraj.linkedlist.SingleLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SingleLinkedList slist=new SingleLinkedList();
		
		
		slist.addNode(12);
		slist.addNode(10);
		slist.addNode(15);
		slist.addNode(7);
		slist.addNode(2);
		slist.displayData();
//		slist.addByPosition(1,100);
//		slist.addByPosition(3, 200);
		//adding after last node
//		slist.addByPosition(8, 300);
		//error check
//		slist.addByPosition(20, 400);
		slist.displayData();
	}

}
