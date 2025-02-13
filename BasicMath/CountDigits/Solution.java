package BasicMath.CountDigits;

public class Solution {
    public static int countOfDigits(int n) {
        int count = 0; // Initialize count to 0
        
        while (n != 0) { // Iterate until n becomes 0
            count++;
            n /= 10; // Remove the last digit of n
        }
        
        return count; // Return the final count
    }
    
    public static void main(String[] args) {
        int result = countOfDigits(1234);
        System.out.println(result); 
    }
}
