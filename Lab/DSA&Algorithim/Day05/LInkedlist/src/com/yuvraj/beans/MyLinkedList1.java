package com.yuvraj.beans;

public class MyLinkedList1 {

	static class Node{
		
		int data;
		Node next;
		
		  public Node(int x) {
	            this.data = x;
	            this.next = null;
	        }
	    
	}
	
	public static void main(String[] args) {
		int value = 100;
		
		Node head = new Node(value);
		
		head.next = new Node(200);
		head.next.next = new Node(300);
		head.next.next.next = new Node(400);
		printList(head);
		
			}
		
         //print the LInkedLIst
		public static void printList(Node head) {
			Node current= head ;
			System.out.println("Print the Linked List");
			while (current!= null ) {
		
				System.out.println("DATA  "+ current.data);
				current=current.next;
				
			}
		}

}
