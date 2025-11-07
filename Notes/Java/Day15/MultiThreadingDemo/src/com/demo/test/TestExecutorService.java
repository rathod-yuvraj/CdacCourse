package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.demo.threads.MyTask;

public class TestExecutorService {

	public static void main(String[] args) {
		//create Executor service object
		ExecutorService es=Executors.newFixedThreadPool(4);
		List<Future> flist=new ArrayList<>();
		for(int i=1;i<=91;i=i+10) {
			MyTask t=new MyTask(i,i+9);
			Future<Integer> f=es.submit(t);
			flist.add(f);
		}
		int sum=0;
		for(Future<Integer> ans:flist) {
			try {
				sum=sum+ans.get();
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("addition for 1 to 100 "+sum);
		try {
			es.awaitTermination(300, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
