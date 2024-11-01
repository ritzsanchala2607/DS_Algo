package BinarySearch;

public class BinarySearch {
    private static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start < end){
            int mid= start+ (end- start) /2;

            if(target <arr[mid]){ //taget value is less than middle then focus on left part of arr
                end= mid-1;
            }else if(target > arr[mid]){//taget value is greater than middle then focus on right part of arr
                start=mid+1;
            }else{ // target values equal to arr[mid], return mid index.
                return mid;
            }
        }
        return -2; 
    }
    public static void main(String[] args) {
        int[] arr={1,21,31,41,51,61,71,81,91,101};
        int target1=61;
        int target2=50;

        System.out.println("Target value index is "+(binarySearch(arr, target1)+1));// it should give 6
        System.out.println("Target value index is "+(binarySearch(arr, target2)+1));// it should give -1 means target value is not exist in array
    }
}
