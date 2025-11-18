package com.yuvraj.linkedlist;

public class SinglyCircularLinkedList {
	
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
			
		}
	}
	public SinglyCircularLinkedList() {
	
		this.head = null;
	}
	
	public void addAtBegin(int values) {
		Node newNode=new Node(values);
		
		if(head==null) {
			head=newNode;
			newNode.next=head;
		} else {
			Node temp=head;
			while(temp.next!=null  ) {
				
				temp=temp.next;
			}
			temp.next=newNode;
			
			newNode.next=head;
			head=newNode;
			
		}
		
	}
	
	public void insertAtPosion(int pos,int val) {
		if(pos==0) {
			System.out.println("List is Empty");
			addAtBegin(val);
		} else {
			Node newNode=new Node(val);
			if(pos==1) {
				Node temp=head;
				
				while(temp.next!=head) {
					temp=temp.next;
				}
				//add at the head Node
				newNode.next=head;
				
				head=newNode;
				temp.next=newNode;
			}else {
				Node temp=head;
				int i=1;
				while(temp.next !=head && i<pos-1) {
					temp=temp.next;
					i++;
				}
				if(i==pos-1) {
					newNode.next=temp.next;
					temp.next=newNode;
				}else {
					System.out.println("Given position "+pos+ "is beyond the lenth of list ");
				}
				
			}
		}
	}
	
	public void deleteByValue(int val) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			if(head.data==val) {
				Node tail=head;
				//place tail at the end
				while(tail.next!=head) {
					tail=tail.next;
			    }
				//if list has only one node and you want to delete the node
				if(tail==head) {
					head=null;
				}else {
					head=head.next;
					temp.next=null;
					tail.next=head;
				}
			}else {
				Node prev=null;
				int i=0;
				for(;temp.next!=head && temp.data!=val;i++) {
					prev=temp;
					temp=temp.next;
				}
				if(temp.data==val) {
					prev.next=temp.next;
					temp.next=null;
				}else {
					System.out.println(val +" not found");
				}
				
				
			}
		}
	}
	public void displayAll() {
		Node temp=head;
		while(temp.next!=head) {
			System.out.print(temp.data+ "-->");
			temp=temp.next;
		}
		System.out.println("null");
	}

}
