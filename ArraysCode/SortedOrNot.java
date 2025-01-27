
public class SortedOrNot {
    public static boolean checkSorted(int[] arr){
        //calculation length of array
        int n=arr.length;

        //traves the array and check next element is greater the previous or not, means array is in ascending order or not
        for(int i=1;i<n;i++){
            if(arr[i]>arr[0]) continue;

            else return false;
        }

        return true;
    }
    public static void main(String [] args){
        int[] array1= {1,2,3,4,5,6,7,8,9,10};
        int[] array2= {10,30,18,27,53,14,6,4,11,21};

        System.out.println("Is Array 1 Sorted? "+checkSorted(array1));
        System.out.println("Is Array 2 Sorted? "+checkSorted(array2));
    }
}
