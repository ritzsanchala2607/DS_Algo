import java.util.*;

public class FindIthBit {
    public static int findBit(int n, int i) {
       
        return (n & (1 << (i - 1))) != 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Binary number: ");
        int n = sc.nextInt();

        System.out.println("Enter ith position (1-based index):");
        int i = sc.nextInt();

        System.out.println(i + "th bit is: " + findBit(n, i));
    }
}
