package com.yuvraj.singly;


class Node {
	int data;
	
	Node next;
public	Node (int data){
		this.data=data;
		this.next=null;
		
	}
	
}
public class LinkedListDemo {
	
	Node head=null;
	
	public void addAfterNum(int data,int num) {
		Node newNode=new Node(data);
		Node temp=head;
		while(temp!=null && temp.data!=num) {
			temp=temp.next;
		}
		if(temp!=null) {
			newNode.next=temp.next;
			temp.next=newNode;
			
		} else {
			System.out.println(num+"Not Found");
		}
	}
	//Node temp;
	void insertAtEnd(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}else {
			Node temp=head;
			while(temp.next!=null) {
//				System.out.print(temp.data+" --");
				temp=temp.next;
			}
			temp.next=newNode;
			
		}
	}
	public void inserAtbegin(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}else {
			Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
			
		}
		temp.next=newNode;
		}
	}
	
	void display() {
		 Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" --");
			temp=temp.next;
		}
	
		
	}
	public static void main(String[] args) {
		
		LinkedListDemo  l=new LinkedListDemo ();
		int[] arr= {
				12,543,23,65,765,234,123
		};
		for(int num: arr) {
//			l.insertAtEnd(num);
			l.inserAtbegin(num);
		}
		
		l.addAfterNum(132123,65);
		l.display();
		

	}

}
