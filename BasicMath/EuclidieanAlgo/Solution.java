package BasicMath.EuclidieanAlgo;

public class Solution {

    public static int findGCD(int n1, int n2) {
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) n1 = n1 % n2;
            else n2 = n2 % n1;
        }

        return (n1 == 0) ? n2 : n1;
    }

    public static void main(String[] args) {
        int gcd = findGCD(20, 40);
        System.out.println("GCD OF 20 And 40 IS " + gcd);
    }
}
