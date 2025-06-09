package goodpairs;

import java.util.Scanner;

public class GoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int n=nums.length;
        int count=0;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]) count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();

        int[] in= new int[n];
        System.out.println("Enter numbers:");
        for(int i=0;i<n;i++){
            in[i]=sc.nextInt();
        }

        
        System.out.println("Number of Good Pairs are "+numIdenticalPairs(in));
    }
}
