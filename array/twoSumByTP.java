package com.array;

public class twoSumByTP {
	public static int[] twoSumSorted(int[] arr, int target) {
	    int left = 0;
	    int right = arr.length - 1;

	    while (left < right) {
	        int current_sum = arr[left] + arr[right];

	        if (current_sum == target) {
	            return new int[]{left, right}; // return indices
	        } else if (current_sum < target) {
	            left++; // need a bigger sum
	        } else {
	            right--; // need a smaller sum
	        }
	    }
	    return new int[]{-1, -1}; // if no pair found
	}
public static void main(String[] args) {
	int[] arr = {2, 7, 11, 15};
    int target = 9;
    int[] result = twoSumSorted(arr, target);

    System.out.println("Indices: " + result[0] + ", " + result[1]);
	
}
}
