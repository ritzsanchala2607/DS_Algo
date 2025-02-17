package NumberHashing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static int hashing(int num, List arr){
        int count=0;
        int n=arr.size();

        for(int i=0; i<n ; i++){
            if((int)arr.get(i) == num){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter total number of digits:");
        int n=sc.nextInt();

        List<Integer> arr= new ArrayList<>();

        for(int i=0; i<n;i++){
            System.out.println("Enter The number: ");
            int temp=sc.nextInt();
            arr.add(temp);
        }

        System.out.println("Enter number to find the count of that numebr: ");
        int find=sc.nextInt();

        int conut=hashing(find, arr);

        System.out.println("Count of "+find+" is: "+conut);
    }
}
