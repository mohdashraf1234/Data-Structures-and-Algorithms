package com.array;

import java.util.Arrays;

public class Rotate_Array_LC_189 {
	//https://www.youtube.com/watch?v=0OTPqrEd74g
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle case where k > n

        // Step 1: Reverse entire array
        reverse(nums, 0, n - 1);
        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);
        // Step 3: Reverse remaining elements
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
    	Rotate_Array_LC_189 sol = new Rotate_Array_LC_189();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original Array: " + Arrays.toString(nums));

        sol.rotate(nums, k);

        System.out.println("Rotated Array:  " + Arrays.toString(nums));
    }
}

