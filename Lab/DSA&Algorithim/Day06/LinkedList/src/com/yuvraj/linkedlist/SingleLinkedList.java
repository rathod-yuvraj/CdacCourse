package com.yuvraj.linkedlist;

public class SingleLinkedList {
	Node head;
	class Node {
		int data;
		Node next;
		public Node (int data) {
			this.data=data;
			this.next=null;
		}
		public Node() {
			head=null;
			System.out.println("Head are null");
		}
	}
		
		//add value after given num
		public void addData(int value,int num) {
			Node newNode=new Node(value);

			Node temp=head;
			while(temp!=null && temp.data!=num) {
				temp=temp.next;
			}
			if(temp!=null) {
				newNode.next=temp.next;
				temp.next=newNode;
			}
			else {
				System.out.println(num+" Not found Node");
			}
			
		}
		//addbypostion
//		public void addByPosition(int pos,int value) {
//			Node newNode=new Node(value);
//			if(pos==1) {
//				newNode.next=head;
//				head=newNode;
//			}else {
//				Node temp =head;
//				for(int i=1; temp!=null &&i<=pos-2;i++) {
//					temp=temp.next;
//				}
//			}
//		}
		//Add Element by End of Linked List
		public void addNode(int value) {
			Node newNode=new Node(value);
			if(head==null) {
				head=newNode;
			} else {
				Node temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=newNode;
			}
			
			
		}
		
		//Add by Frist Element in list
		
		
		//display the linked list
	
	
	public void displayData() {
		if(head==null) {
			System.out.println("My Linked List are Empty");
		} else {
			for(Node temp=head; temp!=null; temp=temp.next) {
				System.out.print(temp.data+"-->");
			}
			System.out.println("null");
		}
	}
		
	

}
