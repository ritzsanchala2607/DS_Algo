package RecursionCodes;

public class ProductOfDigits {
    public static int productofdigits(int n){

        if(n%10== n){
            return n;
        }

        return (n%10)*productofdigits(n/10);
    }
    public static void main(String[] args) {
        
        int ans=productofdigits(161);
        System.out.println("product is:"+ans);
    }
}
