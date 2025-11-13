package com.yuvraj.linkedlist;

public class MyDoublyLinkedList {
	Node head;
	class Node{
		int data;
		Node next,prev;
		
		public Node(int value) {
			this.data=value;
			this.next=null;
			this.prev=null;
		}
		
	}
	public MyDoublyLinkedList(Node head) {
		super();
		this.head = head;
	}
	public MyDoublyLinkedList() {
		this.head =null;
	}
	
	//Add Node 
	
	public void addNode(int val) {
		Node newNode=new Node(val);
		
		if(head==null) {
			head=newNode;
		} 
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
	        temp.next = newNode;     // Link last node to new node
	        newNode.prev = temp;     // Link new node back to last node
		}
		
	}
	public void displayData() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"--->");
			temp=temp.next;
		}
		System.out.println("null");
		
	}
	
	public static void main(String[] args) {
		MyDoublyLinkedList l=new MyDoublyLinkedList();
		l.addNode(25);
		l.addNode(256);
		l.displayData();
	}

}
