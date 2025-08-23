package com.algorithm;

public class selectionSort {

    // Method to perform selection sort (non-recursive)
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Move the boundary of the unsorted subarray one by one
        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element in the unsorted part
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                // Update minIndex if a smaller element is found
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.print("Original array: ");
        printArray(arr);

        selectionSort(arr); // Sort the array

        System.out.print("Sorted array: ");
        printArray(arr);
    }
}
