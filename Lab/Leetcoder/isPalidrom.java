class Solution {
    // public int isPalindrome(int x) {
    //     int rev=0;
    //     int rem=0;
    //     int temp=x;
    //     while(temp<0){
    //         rem=x%10;
    //         rev=rev+rem*10;
    //         temp=x/10;
    //          System.out.println("temp: "+temp);
    //          System.out.println("rem: "+rem);
    //     }
    //     System.out.println("reverse:"+rev);
    //     if(x==rev){
    //         System.out.println("reverse:"+rev);
    //         return rev;
    //     }else{
    //         return rem;
    //     }
        
    // }
    public static void main(String[] args) {
        // Solution s=new Solution();
        // s.isPalindrome(121);
        System.out.println();
        int temp=121;
       int rem=0;
       int rev=0;
        while(temp>0){
           rem=temp%10;
            rev=rem+rev*10;
            temp=temp/10;
           
        }
        System.out.println("reverse:"+rev);

    }
}