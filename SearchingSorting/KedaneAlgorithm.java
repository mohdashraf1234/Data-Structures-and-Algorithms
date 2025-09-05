package Searchingu.Sorting;

class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        KadaneAlgorithm ka = new KadaneAlgorithm();
        int maxSum = ka.maxSubArray(arr);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    int maxSubArray(int[] arr) {
        int maxSoFar = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Either extend current subarray or start a new subarray
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar;
    }
}

