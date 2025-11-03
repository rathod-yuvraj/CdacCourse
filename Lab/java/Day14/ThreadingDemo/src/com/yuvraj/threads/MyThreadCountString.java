package com.yuvraj.threads;

import com.yuvraj.beans.StringcountWord;

public class MyThreadCountString extends Thread{
	
	private String msg;
	private StringcountWord sb;
	public MyThreadCountString(String msg, StringcountWord sb) {
		super();
		this.msg = msg;
		this.sb = sb;
	}
	public void run() {
		int ans=sb.CountWord(msg);
		System.out.println("Word:"+ans);
	}

}
