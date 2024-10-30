package RecursionCodes;

public class LinearSearch {
    private static int search(int[] arr, int index, int key){
        if(index == arr.length){// if key is not present then return -1
            return -1;
        }
        if(arr[index]== key){// if key is not present then return index
            return index;
        }

        return search(arr, index+1, key);
    }
    public static void main(String [] args){
        int[] arr={1,2,3,40,8,60,7,80,9};

        int index=search(arr, 0, 8);

        if(index <0){
            System.out.println("Key is not present in array");
        }else{
            System.out.println("Key at"+(index+1)+" Position");
        }
    }
}
