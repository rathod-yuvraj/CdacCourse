import java.util.Scanner;

public class TestArray{
    public static void acceptdata(int[] arr)
    {
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("Enter data");
            arr[i]=sc.nextInt();
        }


       sc.close();
    }

    public static void  display(int[] arr){


        for(int i=0; i<arr.length;i++){
     
            System.out.print(" \t"+arr[i]);
        }
    }
    public static void main(String args[]){
    int [] arr=new int[10];
    acceptdata(arr);
    display(arr);
}


}

