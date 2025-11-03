package com.demo.test;

import com.demo.beans.MyStorage;
import com.demo.threads.ConsumerThread;
import com.demo.threads.ProducerThread;

public class TestProducerConsumer {
  public static void main(String[] args) {
	MyStorage s=new MyStorage();
	ProducerThread p1=new ProducerThread(s);
	ConsumerThread c1=new ConsumerThread(s);
	p1.start();
	c1.start();
}
}
