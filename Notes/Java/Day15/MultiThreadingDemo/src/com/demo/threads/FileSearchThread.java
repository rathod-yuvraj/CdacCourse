package com.demo.threads;

import com.demo.beans.FileSearch;

public class FileSearchThread extends Thread{
	private FileSearch fs;
	private String wrd;
	
	
	public FileSearchThread(FileSearch fs, String wrd) {
		super();
		this.fs = fs;
		this.wrd = wrd;
	}


	public void run() {
		 boolean status=fs.searchWord("myword.txt", wrd);
	        if(status) {
	        	System.out.println(wrd +"word found");
	        }else {
	        	System.out.println(wrd+" not found");
	        }
	}

}
