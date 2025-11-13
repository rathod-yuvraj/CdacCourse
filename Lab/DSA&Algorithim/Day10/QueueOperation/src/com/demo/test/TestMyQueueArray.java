package com.demo.test;

import com.demo.queuearray.MyQueueArray;

public class TestMyQueueArray {

	public static void main(String[] args) {
		MyQueueArray q=new MyQueueArray();
		
		q.enQueue(10);
		q.enQueue(11);
		q.enQueue(13);
		q.enQueue(15);
		q.enQueue(16);
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();

	}

}
