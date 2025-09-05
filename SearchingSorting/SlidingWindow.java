package Searchingu.Sorting;

class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        SlidingWindow sw = new SlidingWindow();
        int maxSum = sw.maxSumSubarray(arr, k);
        System.out.println("Maximum Sum of Subarray of size " + k + " = " + maxSum);
    }

    int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;
        int windowSum = 0;
        int maxSum;

        // Step 1: Calculate sum of first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // Step 2: Slide the window
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k]; // Add new element, remove old
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}

