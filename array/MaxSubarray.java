package com.top30;

public class MaxSubarray {

    // Brute Force Method O(n^2)
    public static int maxSubarrayBruteForce(int[] nums) {
        int n = nums.length;
        int maxSum = -1000000; // very small number

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + nums[j]; // sum of subarray from i to j
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    // Kadane's Algorithm O(n)
    public static int maxSubarrayKadane(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // instead of Math.max
            if (nums[i] > maxEndingHere + nums[i]) {
                maxEndingHere = nums[i];
            } else {
                maxEndingHere = maxEndingHere + nums[i];
            }

            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Brute Force Result: " + maxSubarrayBruteForce(arr));
        System.out.println("Kadane's Result: " + maxSubarrayKadane(arr));
    }
}
