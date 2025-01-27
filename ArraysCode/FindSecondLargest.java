public class FindSecondLargest {
    public static int second_largest_Element(int[] arr){
        int n=arr.length;

        //intially considering 1st element of array is largest and second largest 
        int largest= arr[0]; 
        int secondLargets=0;

        for(int i=1;i<n;i++){
            /*
            if largest value is lower that current element of array, then assigned that value in largedt
            and before that add largest value in second largest
            */
            if(largest<arr[i]){
                secondLargets=largest;
                largest =arr[i];
            }
        }
        return secondLargets;
    }
    public static void main(String [] args){
        int[] array1= {1,2,3,4,5,6,7,8,9,10};
        int[] array2= {10,30,18,27,53,14,6,4,11,21};

        System.out.println("Second Largest element in Array 1 is:" + second_largest_Element(array1));
        System.out.println("Second Largest element in Array 2 is:" + second_largest_Element(array2));
    }
}
