package BasicMath.CheckArmstrong;

public class Solution {
    public static boolean checkArmstrong(int n){
        int sum=0;
        int original=n;
        while(n!=0){
            int temp=n%10;
            sum += (temp*temp*temp);
            n/= 10;
        }

        if(sum == original){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean answer= checkArmstrong(371);
        System.out.println("Is 371 is Armstrong number: "+answer);
    }
}
