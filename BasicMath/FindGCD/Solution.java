package BasicMath.FindGCD;

public class Solution {
    public static int findGCD1(int n1, int n2){
        int gcd=1;

        for(int i=1; i<=Math.min(n1,n2); i++){
            if(n1%i ==0 && n2%i==0) gcd=i;
        }

        return gcd;
    }

    //we start loop from end so we get gcd as soon as possible
    public static int findGCD2(int n1, int n2){
        int gcd=1;

        for(int i=Math.min(n1,n2); i>=1; i--){
            if(n1%i ==0 && n2%i==0) gcd=i;
        }

        return gcd;
    }
    public static void main(String[] args) {
        int gcd=findGCD1(11, 13);
        System.out.println("Brute Force Approach, GCD OF 11 AND 13 IS "+ gcd);

        int gcd2=findGCD2(20, 40);
        System.out.println("Optimal Approach, GCD OF 20 AND 40 IS "+ gcd2);
    }
}
