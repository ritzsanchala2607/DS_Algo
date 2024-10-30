package RecursionCodes;

public class CheckArrSorted {
    public static boolean sorted(int[] arr, int index){ //input remaing array with starting index
        //Base Condition
        if(index == arr.length-1){ //when reach at last index return true
            return true;
        }

        return arr[index]<arr[index+1] &&sorted(arr, index+1);
    }
    public static void main(String [] args){
        int[] arr1={1,2,3,4,5,6,7,8,9,10};//sorted array
        int[] arr2={1,2,3,4,5,1,7,8,9,10};//unsorted array

        System.err.println("Array1 is Sorted:"+sorted(arr1,0));//should give true
        System.err.println("Array2 is Sorted:"+sorted(arr2,0));//should give false
    }

}
