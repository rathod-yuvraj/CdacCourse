package com.demo.test;

import com.demo.beans.FileSearch;
import com.demo.threads.FileSearchThread;

public class TestFileSearch {

	public static void main(String[] args) {
		String[] strarr= {"work","check","Test","joy","xxxxx"};
        FileSearch fs=new FileSearch();
        FileSearchThread[] arr=new  FileSearchThread[strarr.length];
        for(int i=0;i<strarr.length;i++) {
	      arr[i]=new FileSearchThread(fs, strarr[i]);
	      arr[i].start();
        }
	}

}
