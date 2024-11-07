package BinarySearch;

public class CeilingNumber {
    private static void ceilingSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // If target is larger than the largest element, there is no ceiling
        if (target > arr[end]) {
            System.out.println("Ceiling number does not exist.");
            return;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println("Ceiling number is " + arr[mid]);
                return;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // At this point, start is pointing to the smallest element >= target
        System.out.println("Ceiling number is " + arr[start]);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        ceilingSearch(arr, 65); // it should give 70
        ceilingSearch(arr, 50);// it should give 50
    }
}
