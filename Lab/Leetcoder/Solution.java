public class Solution {
    public int reverse(int x) {
          int rev=0;
          int temp=x;
          int rem=0;
        while(0<temp){
            rem=x%10;
            rev+=rem*10;
            temp=x/10;
        }
        return rev;
        
    }
} 
