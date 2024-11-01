package SortingAlgorithms.MergeSort;

import java.util.Arrays;

public class MergeSort {

    // Sorts the input array using merge sort and returns the sorted array
    private static int[] sort(int[] arr) {
        // Base case: if the array has only one element, return it
        if (arr.length == 1) {
            return arr;
        }

        // Find the middle index to divide the array into two halves
        int mid = arr.length / 2;

        // Recursively sort the left and right halves
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge the sorted halves and return the sorted array
        return merge(left, right);
    }

    // Merges two sorted arrays (left and right) into a single sorted array
    private static int[] merge(int[] left, int[] right) {
        // Create an array to store the merged result
        int[] sorted = new int[left.length + right.length];

        // Pointers for traversing left, right, and sorted arrays
        int i = 0; // pointer for left array
        int j = 0; // pointer for right array
        int k = 0; // pointer for sorted array

        // Merge elements by comparing elements of left and right arrays
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                sorted[k] = left[i];
                i++;
            } else {
                sorted[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left array
        while (i < left.length) {
            sorted[k] = left[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right array
        while (j < right.length) {
            sorted[k] = right[j];
            j++;
            k++;
        }

        return sorted;
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 1, 2, 3};

        // Sort the array
        arr = sort(arr);

        // Print the sorted array using Arrays.toString() for correct format
        System.out.println(Arrays.toString(arr));
    }
}
