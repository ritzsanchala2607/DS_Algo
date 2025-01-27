public class FindLargestElement {
    public static int largest_Element(int[] arr){
        int n=arr.length;
        int ans= arr[0]; //intially considering 1st element of array is largest

        for(int i=1;i<n;i++){
            //id ans value is lowest that current element of array, then assigned that value in ans
            if(ans<arr[i]){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String [] args){
        int[] array1= {1,2,3,4,5,6,7,8,9,10};
        int[] array2= {10,30,18,27,53,14,6,4,11,21};

        System.out.println("Largest element in Array 1 is:" + largest_Element(array1));
        System.out.println("Largest element in Array 2 is:" + largest_Element(array2));
    }
}
