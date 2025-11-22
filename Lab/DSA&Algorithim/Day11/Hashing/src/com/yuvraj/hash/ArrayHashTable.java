package com.yuvraj.hash;

public class ArrayHashTable {
	  Integer[] table;
//	  int[] table;

	public ArrayHashTable(int size) {
		
//		this.table =new int[size];
		table=new Integer[size];
	}
	public ArrayHashTable() {
//		table=new int[10];
		table=new Integer[5];
	}
	
	private int hash(int num) {
		
		
		return num%table.length;
	}
	public void insertData(int key) {
	    int index = hash(key);
	    int start = index;
	    boolean inserted = false;

	    do {
	        if (table[index] == null) {
	            table[index] = key;
	            inserted = true;
	            break;
	        }
	        index = (index + 1) % table.length;
	    } while (index != start);

	    if (!inserted) {
	        System.out.println("Hash table is full. Cannot insert " + key);
	    }
	}

//	public boolean search(int key) {
//		int index=hash(key);
//		
//		while(table[index]!=null) {
//			if(table[index]==key) {
//				System.out.println("Searching key is "+key);
//				return true; 
//			} else {
//				System.out.println("Not fund");
//			}
//		}
//		
//		return false;
//	}
	public boolean search(int key) {
	    int index = hash(key);
	    int start = index;

	    while (table[index] != null) {
	        if (table[index] == key) {
	            System.out.println("Searching key is " + key);
	            return true;
	        }
	        index = (index + 1) % table.length;
	        if (index == start) break; // prevent infinite loop
	    }
	    return false;
	}
	public boolean delete(int key) {
	    int index = hash(key);
	    int start = index;

	    while (table[index] != null) {
	        if (table[index] == key) {
	            table[index] = -1; // mark as deleted
	            return true;
	        }
	        index = (index + 1) % table.length;
	        if (index == start) break;
	    }
	    return false;
	}

//	public boolean delete(int key) {
//		int index=hash(key);
//		while(table[index]!=null) {
//			if(table[index]==key) {
//				table[index]=-1;
//				return true;
//			}
//		}
//		
//		
//		return false;
//	}
	public void display() {
		for(int i=0;i<table.length;i++) {
			 System.out.println(" : "+i +": "+ " --> " + (table[i] != null ? table[i] : " null "));
        }
	}
	public static void main(String[] args) {
		ArrayHashTable a=new ArrayHashTable();
		a.insertData(10);
		a.insertData(20);

		a.insertData(19);
		a.insertData(15);
		a.insertData(89);
		a.insertData(29);
		a.insertData(90);
		a.search(15);
		a.display();
		a.delete(15);
		
	System.out.println(	a.delete(24));
				
	
		a.search(100);
		a.display();
		
	}
	
	
	
	

}
