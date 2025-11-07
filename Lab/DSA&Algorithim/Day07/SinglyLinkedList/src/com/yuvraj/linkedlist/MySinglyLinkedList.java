package com.yuvraj.linkedlist;

public class MySinglyLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	public MySinglyLinkedList() {
		this.head = null;
	}
	
	
	public void  addData(int value) {
		Node newNode=new Node(value);
		Node temp=head;
		if(head==null) {
			head=newNode;
		}
		else {
			while(temp!=null) {
				
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	public void displayAll() {
		
		Node temp=head;
		if(temp==null) {
			System.out.println("Empty List");
		}
		while(temp!=null) {
			System.out.println(temp.data+"-->");
			temp=temp.next;
		}
		
		
	}
public static void main(String[] args) {
		MySinglyLinkedList a=new MySinglyLinkedList();
		a.addData(10);
		a.addData(30);
		a.displayAll();

	}


}
