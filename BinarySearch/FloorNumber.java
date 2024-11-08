package BinarySearch;

public class FloorNumber {
    private static void floorSearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        // If target is larger than the largest element, there is no Floor
        if (target > arr[end]) {
            System.out.println("Floor number does not exist.");
            return;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println("Floor number is " + arr[mid]);
                return;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // At this point, start is pointing to the smallest element >= target
        System.out.println("Floor number is " + arr[start-1]);
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        floorSearch(arr, 45); // it should give 40
        floorSearch(arr, 10);// it should give 10
    }
}
