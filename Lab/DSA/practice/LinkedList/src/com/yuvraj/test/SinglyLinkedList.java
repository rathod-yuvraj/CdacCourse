package com.yuvraj.test;

public class SinglyLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	
	public SinglyLinkedList() {
		
		this.head = null;
	}


	public void insertAtEnd(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}

	public void inserAtBegin(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		
	}
	public void deleteFirst() {
		if(head!=null) {
			head=head.next;
			
		}
	}
	public void deleteAtPos(int pos) {
		if(pos==1) {
			deleteFirst();
			return;
		}
		
		Node temp=head;
		for(int i=0;i<pos-1 && temp!=null;i++) {
			temp=temp.next;
			
		}
		if(temp==null &&temp.next==null) {
			System.out.println("Invalid ");
		}
		
		temp.next=temp.next.next;
	}
		public void display() {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+"--");
				temp=temp.next;
			}
			System.out.println("null");
		}
	public static void main(String[] args) {
		SinglyLinkedList b=new SinglyLinkedList();
		int[] arr= {
				12,54,32,65,87,1,56,87
		};
		for(int num:arr) {
			b.insertAtEnd(num);
		}
		b.deleteAtPos(6);
		b.deleteFirst();
		
		
	
		b.display();
		

	}

}
