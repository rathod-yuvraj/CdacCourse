package com.demo.queuearray;

public class MyQueueArray {
	int front;
	int rear;
	int[] arr;
	
	public MyQueueArray() {
		this.arr=new int[10];
		this.front = -1;
		this.rear =-1;
	}
	public MyQueueArray(int size) {
		int[] arr=new int[size];
		this.front = -1;
		this.rear =-1;
	}
	
	public boolean isEmpty() {
		if(front==-1) {
			System.out.println("Queue is empty");
			return true;
		}
		return false;
	}
	public boolean isFull() {
		if(front==0 && rear==arr.length-1) {
			System.out.println("Queue is full");
			return true;
		} else if(front==rear+1) {
			System.out.println("Queue is full");
			return true;
			
		}
		
		return false;
	}
  
	
//	insert in queue
	public boolean enQueue(int num) {
	if(!isFull()) {
			if(front==-1) {
				front=0;
			}
			rear = (rear + 1) % arr.length;
			arr[rear] = num;

			System.out.println("Successfully data add "+num);
			return true;
		}
		
		return false;
		
	}
	public int deQueue() {
		
		
		if(!isEmpty()) {
			int value = arr[front]; // get the value before updating front
			if (front == rear) {
			    front = rear = -1;
			} else {
			    front = (front + 1) % arr.length;
			}
			System.out.println("Data deleted successfully: " + value);
			return value;
		}
		return -1;
		
	}
}
