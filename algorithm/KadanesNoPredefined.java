package com.algorithm;

public class KadanesNoPredefined {
    public static int maxSubArraySum(int[] arr) {
        int currentMax = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (currentMax + arr[i] > arr[i]) {
                currentMax = currentMax + arr[i];
            } else {
                currentMax = arr[i];
            }

            if (currentMax > maxSoFar) {
                maxSoFar = currentMax;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSubArraySum(arr));
    }
}
