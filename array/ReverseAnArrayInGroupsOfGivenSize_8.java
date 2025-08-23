package com.array;

public class ReverseAnArrayInGroupsOfGivenSize_8 {

    public static void reverseArrayInGroups(int[] arr, int d) {
        int n = arr.length;

        for (int i = 0; i < n; i += d) {
            int left = i;
            int right = Math.min(i + d - 1, n - 1);

            // Reverse subarray from left to right
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // Print the final array
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int d = 3;

        reverseArrayInGroups(arr, d);
    }
}
