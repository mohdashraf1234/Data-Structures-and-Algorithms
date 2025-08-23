package com.array;

public class Sliding_Window_Technique {
	// Method to find the maximum sum of a subarray of size w
    public static int maxWindowSum(int[] arr, int w) {
        int n = arr.length;
        if (w > n) {
            throw new IllegalArgumentException("Window size cannot be larger than array length.");
        }

        int current = 0;

        // Calculate sum of the first window
        for (int i = 0; i < w; i++) {
            current += arr[i];
        }

        int maxSum = current;

        // Slide the window across the array
        for (int j = 1; j <= n - w; j++) {
            current = current - arr[j - 1] + arr[j + w - 1]; // Remove leftmost, add rightmost
            if (current > maxSum) {
                maxSum = current;
            }
        }

        return maxSum;
    }
	public static void main(String[] args) {
		//https://www.youtube.com/watch?v=uqGxFk0cEdI
		 int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
	        int w = 4;

	        int result = maxWindowSum(arr, w);
	        System.out.println("Maximum sum of window size " + w + " is: " + result);
		
	}

}
