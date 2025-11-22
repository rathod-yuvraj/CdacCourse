package com.yuvraj.beans;

public class StringcountWord {
	
	public int CountWord(String msg) {
		 String[] words = msg.trim().split("\\s+");
	        return words.length;
		
	}
	public String CountWords(String msg) {
		
		 String[] words = msg.trim().split("\\s+");
		    return String.join(", ", words);
		
	}

}
