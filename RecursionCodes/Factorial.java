package RecursionCodes;

public class Factorial {
    public static int Fact(int n){
        if(n<=1){
            return 1;
        }

        return n* Fact(n-1);
        
    }
    public static void main(String[] args) {
        int ans=Fact(5);
        System.out.println("Fact is :"+ans);
    }
}
