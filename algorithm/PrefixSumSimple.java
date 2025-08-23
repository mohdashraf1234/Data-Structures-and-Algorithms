package com.algorithm;

public class PrefixSumSimple {
	public static void main(String[] args) {
		int[] arr = {2, 4, 5, 7};

        // Step 1: Build prefix sum array
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Step 2: Find sum from index 1 to 3
        int left = 1, right = 3;
        int sum = prefix[right] - prefix[left - 1];

        // Step 3: Output
        System.out.println("Sum from index " + left + " to " + right + " = " + sum);
	}

}
