package BasicMath.PrintAllDevisors;

public class Solution {
    public static void printDevisors(int n){
        for(int i=1; i<=n ;i++){
            if(n%i ==0) System.out.print(i +" ");
        }
    }
    public static void main(String [] args){
        printDevisors(18);
    }
}
