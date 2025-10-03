import java.util.Scanner;

public class ArrayService {
	
	public static void acceptData(int [] arr) {
		
		 Scanner obj=new Scanner(System.in);
		 System.out.println("Enter the Number: ");
		
		for(int i=0; i<arr.length;i++) {
			
			arr[i]=obj.nextInt();
			
		}
		obj.close();
	}
	
	public static void displayData(int arr[]) {
		System.out.print("{");
		for(int i=0; i<arr.length;i++) {
			
			System.out.print("\t"+arr[i]);
		}
		System.out.println("}");
	}
	
	public static void arrayMax(int[] arr ) {
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println("Max Number in Array: "+max);
		
	}

public static void arrayMin(int[] arr ) {
		
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<min) {
				min=arr[i];
			}
		
		}
		System.out.println("Min Number in Array: "+min);
		
	}
public static void additionArray(int[] arr) {
	
	
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	
	System.out.println("Additions Of All element in Array:"+sum);
	
	
}
                                                                      

public static int SearchByvalue(int[] arr,int find) {
	
	for(int i=0; i<arr.length;i++) {
		if(find==arr[i]) {
			return i;
		}
			
		
	}
	return -1;
}

public static int findNthMin(int[] arr,int n) {
	int pos=0;
	for(int i=0;i<arr.length;i++) {
		int temp=arr[i];
		arr[i]=arr[pos];
		arr[pos]=temp;
	}
	return arr[n-1];
	
	
}

public static int findMinPos(int[] fin,int start) {
	int pos=start;
	int min=fin[pos];
	for(int i=0; i<fin.length;i++) {
		int temp=fin[i];
		fin[i]=fin[pos];
		fin[pos]=temp;
	}
	return fin[pos];
}

public static int[] findAllOccurrences(int[] arr, int num) 
{
    int[] temp = new int[arr.length];
    for (int i = 0; i < temp.length; i++)
    {
        temp[i] = -1;
    }

    int cnt = 0;
    for (int i = 0; i < arr.length; i++)
    {
        if (arr[i] == num)
         {
            temp[cnt] = i;
            cnt++;
        }
    }
//    System.out.println("Find All Occurrences"+cnt);
    
    return temp;
  }
}
 

