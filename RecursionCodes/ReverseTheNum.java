package RecursionCodes;

public class ReverseTheNum {
    static String Answer = "";

    public static String reverse(int n) {
        if (n == 0) {
            return Answer;
        }
        int rem = n % 10;
        Answer += Integer.toString(rem); 
        return reverse(n / 10);         
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Reversed number: " + reverse(number));
    }
}
