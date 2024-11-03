package OrderAgnosticBinarySearch;

public class OrderAgnosticBS {

    // Method to perform binary search on a descending sorted array
    private static int Descending(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Calculate the middle index
            int mid = start + (end - start) / 2;

            // Check if the target is at the middle position
            if (target == arr[mid]) {
                return mid; // Target found
            } else if (target > arr[mid]) {
                // Move to the left side if target is greater than the mid element
                end = mid - 1;
            } else {
                // Move to the right side if target is less than the mid element
                start = mid + 1;
            }
        }

        // Return -1 if the target is not found
        return -1;
    }

    // Method to perform binary search on an ascending sorted array
    private static int Ascending(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Calculate the middle index
            int mid = start + (end - start) / 2;

            // Check if the target is at the middle position
            if (target == arr[mid]) {
                return mid; // Target found
            } else if (target > arr[mid]) {
                // Move to the right side if target is greater than the mid element
                start = mid + 1;
            } else {
                // Move to the left side if target is less than the mid element
                end = mid - 1;
            }
        }

        // Return -1 if the target is not found
        return -1;
    }

    public static void main(String[] args) {
        // Example arrays
        int[] arr = {10, 20, 30, 40, 50, 60, 70}; // Ascending order
        int[] arr1 = {70, 60, 50, 40, 30, 20, 10}; // Descending order
        int target = 50; // Target element to find

        // Check the order of the array by comparing the first two elements
        if (arr1[0] < arr1[1]) {
            System.out.println("Array is in ascending order");
            // Call the Ascending method if the array is sorted in ascending order
            System.out.println("Target Element at index " + Ascending(arr1, target));
        } else {
            System.out.println("Array is in descending order");
            // Call the Descending method if the array is sorted in descending order
            System.out.println("Target Element at index " + Descending(arr1, target));
        }
    }
}
