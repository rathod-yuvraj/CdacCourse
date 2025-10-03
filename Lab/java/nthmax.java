public static int findNthMin(int[]arr,int n)
{
    for(int i=0;i<arr.length;i++)
    {
        int pos=findMInPos(arr,i);
        int temp=arr[i];
        arr[i]=arr[pos];
        arr[pos]=temp;
        //
    }
    return arr[n-1];
}
    public static int findMinPos(int[] arr,int start)
    {
        int pos= start;
        int min= arr[pos];
        for(int i=start+1;i<arr.length;i++)
        {
            if (min>arr[i]){
                pos =i;
                min =arr[i];
            }
        } return pos;
    }
