package com.yuvraj.link;

import java.util.Stack;

public class singlyList {
	
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
			
		}
		
	}

	public singlyList() {
	
		this.head =null;
	}
//	insert the data in Linked list
	public void insertData(int val) {
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
		
	}
//	insert the element in by pos
	
	
	
	
	
	
//	reverse the linked list
	public void  revDisplay() {
		
		   Stack<Node> s= new Stack <>(); 
		   Node temp=head;
		if(head==null) {
			System.out.println("List are empty");
		}
		while(temp!=null) {
			s.push(temp);
			temp=temp.next;
		}
		while(!s.empty()) {
			Node temp1=s.pop();
			System.out.print(temp1.data+"---");
		}
		System.out.println();
		
	}
	public void revSingly() {
		
		Node prev = null;
		Node curr = head;
		Node next = null;

		while (curr != null) {
		    next = curr.next;   // save next
		    curr.next = prev;   // reverse link
		    prev = curr;        // move prev forward
		    curr = next;        // move curr forward
		}
		head = prev;

		System.out.println("Reverse Linked List My Logic");
		display();
	}
	
	public void display() {
		if(head==null) {
			System.out.println("List are empty");
			return;
		} 
		
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" --->");
				temp=temp.next;
			}
			System.out.println("null");
		
	}

	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		singlyList s=new singlyList();
		s.display();
		s.insertData(10);
		
		
	    s.insertData(20);
	    s.insertData(10);
	    s.insertData(40);
	    s.insertData(60);
	    s.insertData(10);
	    s.insertData(80);
	    s.display();
	    s.revSingly();
	   
	 
//		s.display();
//		System.out.println("Reverse List");
//		 s.revDisplay();

	}

}
