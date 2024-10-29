package RecursionCodes;

public class _1toN {

    public static void print1toN(int n){
        if(n==0){
            return;
        }
        print1toN(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        print1toN(10);
    }
}
