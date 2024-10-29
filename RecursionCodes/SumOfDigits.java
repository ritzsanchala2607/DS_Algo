package RecursionCodes;

public class SumOfDigits {
    public static int sumofdigits(int n){

        if(n==0){
            return 0;
        }

        return (n%10)+sumofdigits(n/10);
    }
    public static void main(String[] args) {
        
        int ans=sumofdigits(1016);
        System.out.println("Sum is:"+ans);
    }
    
}
