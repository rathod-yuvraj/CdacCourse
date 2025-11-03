import java.util.*;
public class ArrayTest {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
         int[] arr = new int [5];
         ArrayService.acceptData(arr);
         ArrayService.displayData(arr);
         ArrayService.arrayMax(arr);
         ArrayService.arrayMin(arr);
         ArrayService.additionArray(arr);
        System.out.println( ArrayService.SearchByvalue(arr, 3));
        System.out.println(ArrayService.findMinPos(arr, 2));
        System.out.println(ArrayService.findNthMin(arr, 3));
        int[] result = ArrayService.findAllOccurrences(arr, 2);

        System.out.print("Occurrences at indexes: ");
        for (int index : result) {
            if (index != -1) {   // ignore unused slots
                System.out.print(index + " ");
            }
        }
    }   
	}

