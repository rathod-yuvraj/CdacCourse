package com.demo.threads;

import com.demo.beans.MyStorage;

public class ConsumerThread extends Thread{
	    private MyStorage s;
	    
	
         public ConsumerThread(MyStorage s) {
			super();
			this.s = s;
		}


		public void run() {
        	 for(int i=1;i<=10;i++) {
        			s.get();
        		}
         }
}
