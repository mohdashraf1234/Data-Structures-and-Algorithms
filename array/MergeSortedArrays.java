package com.array;

import java.util.Arrays;

public class MergeSortedArrays {

    /**
     * Merges two sorted arrays into one sorted array using two-pointer technique.
     *
     * @param firstArray  sorted array 1
     * @param secondArray sorted array 2
     * @return merged sorted array
     */
    public static int[] mergeSortedArrays(int[] firstArray, int[] secondArray) {
        int pointer1 = 0; // Pointer for firstArray
        int pointer2 = 0; // Pointer for secondArray
        int mergedIndex = 0; // Pointer for mergedArray

        int[] mergedArray = new int[firstArray.length + secondArray.length];

        // Compare elements from both arrays and insert the smaller one
        while (pointer1 < firstArray.length && pointer2 < secondArray.length) {
            if (firstArray[pointer1] <= secondArray[pointer2]) {
                mergedArray[mergedIndex++] = firstArray[pointer1++];
            } else {
                mergedArray[mergedIndex++] = secondArray[pointer2++];
            }
        }

        // Copy remaining elements from firstArray (if any)
        while (pointer1 < firstArray.length) {
            mergedArray[mergedIndex++] = firstArray[pointer1++];
        }

        // Copy remaining elements from secondArray (if any)
        while (pointer2 < secondArray.length) {
            mergedArray[mergedIndex++] = secondArray[pointer2++];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] firstArray = {1, 3, 5, 7};
        int[] secondArray = {2, 4, 6, 8};

        int[] mergedResult = mergeSortedArrays(firstArray, secondArray);

        System.out.println("Merged Sorted Array: " + Arrays.toString(mergedResult));
    }
}
