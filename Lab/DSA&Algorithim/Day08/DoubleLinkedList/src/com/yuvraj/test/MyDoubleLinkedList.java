package com.yuvraj.test;

public class MyDoubleLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		
	public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public MyDoubleLinkedList() {
	   this.head=null;
	}
	public void addEnd(int val) {
		Node newNode=new Node(val);
		Node temp=head;
		if(head==null) {
			head=newNode;
			newNode.next = head; // circular link
		}
		else {
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.next = head; // maintain circularity
		}
	}
	
	public void displayAll() {
		Node temp=head;
		
	        do {
	            System.out.print(temp.data + " --> ");
	            temp = temp.next;
	        } while (temp != head);
	        System.out.println("(back to head)");
	    
		
		
	}
	public static void main(String[] args) {
		MyDoubleLinkedList a=new MyDoubleLinkedList();
		
		a.addEnd(10);
		a.addEnd(30);
		a.displayAll();
		

	}

}
