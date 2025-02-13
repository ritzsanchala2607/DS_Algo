package BasicMath.ReverseNumber;

public class Solution {
    public static int reverse(int n){
        int reverse=0;
        
        while(n!=0){
            int temp =n%10;

            reverse= (reverse*10)+temp;

            n /=10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        int reversNumber= reverse(654);
        System.out.println("Reverse Number is:"+ reversNumber);
    }
}
