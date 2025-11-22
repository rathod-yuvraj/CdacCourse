package com.yuvraj.test;

import com.yuvraj.linkedlist.SinglyCircularLinkedList;

public class TestSinglyCircular {

	public static void main(String[] args) {
		SinglyCircularLinkedList slist=new SinglyCircularLinkedList();
		slist.addAtBegin(21);
		slist.addAtBegin(22);
		slist.addAtBegin(26);
		slist.addAtBegin(58);
		slist.addAtBegin(59);
		slist.addAtBegin(52);
		slist.deleteByValue(22);
		slist.deleteByValue(23);
		slist.deleteByValue(26);
		slist.addAtBegin(21);
		slist.addAtBegin(64);
		slist.insertAtPosion(5, 40);
		slist.insertAtPosion(10, 40);
		slist.displayAll();

	}

}
