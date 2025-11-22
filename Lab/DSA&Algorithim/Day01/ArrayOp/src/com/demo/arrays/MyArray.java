import java.util.Arrays;

public class MyArray{
	private int[] arr;
	private int count;//non-static
	
	public MyArray() {
		arr = new int [10];
		count = 0;
		
	}
	public MyArray(int [] arr , int count) {
	this.arr=arr;
	this.count=count;
	}
    
	public MyArray(int size) {
		arr = new int[size];
		count=0;
		}
	public int getCapacity() {
		return  arr.length;
		
	}
	
	public int getSize() {
		return count;
	}
	
	//add at given position
	public boolean add(int value,int pos) {
		if(count<arr.length && pos< count ) {
			//shifting on location on right
			for(int i=count;i>pos;i--) {
				arr[i]= arr[i-1];	
				arr[pos] = value;
				count++;
				return true;
		}
			return false;
		
	}	
		//for searching value
		public int searchByValue(int value) {
			for(int i=0;i<count;i++) {
				if (arr)
			}
		}
	
	
}



