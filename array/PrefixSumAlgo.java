package com.array;

public class PrefixSumAlgo {
	public static void main(String[] args) {
		int[] arr = {2, 4, 5, 7}; //2 6 11 18
        int n = arr.length;

        int[] prefixSum = new int[n];
        
        // First element of prefix sum is same as the array
        prefixSum[0] = arr[0];

        // Calculate prefix sum
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        // Print prefix sum array
        System.out.print("Prefix Sum Array: ");
        for (int sum : prefixSum) {
            System.out.print(sum + " ");
        }

	}

}
