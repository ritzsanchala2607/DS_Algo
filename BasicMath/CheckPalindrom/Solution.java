package BasicMath.CheckPalindrom;

public class Solution {
    public static int reverse(int n){
        int reverse=0;

        while(n!=0)
        {
            int lastdigit=n%10;
            reverse= (reverse*10)+lastdigit;
            n /=10;

        }
        return reverse;
    }

    public static boolean checkPalindrom( int original) {

        int revNumber= reverse(original);
        if(original== revNumber) return true;
    
        return false;
    }
    public static void main(String[] args) {
        boolean answer= checkPalindrom(18881);

        System.out.println("Is number is palindrom "+ answer);
    }
}
