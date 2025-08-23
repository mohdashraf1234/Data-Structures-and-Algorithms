package com.array;

public class MissingAndRepeatingInAnArray_15 {
	//https://www.youtube.com/watch?v=R-J6zKqFvCE
	 public static int[] findTwoElement(int[] arr, int n) {
	        int[] res = new int[2]; // res[0] = repeating, res[1] = missing
	        int[] checkArr = new int[n + 1]; // index 0 unused

	        // Count frequency of each element
	        for (int i = 0; i < n; i++) {
	            if (checkArr[arr[i]] == 0) {
	                checkArr[arr[i]] = 1;
	            } else if (checkArr[arr[i]] == 1) {
	                res[0] = arr[i]; // Repeating element
	            }
	        }

	        // Find the missing number
	        for (int i = 1; i <= n; i++) {
	            if (checkArr[i] == 0) {
	                res[1] = i; // Missing element
	            }
	        }

	        return res;
	    }
	public static void main(String[] args) {
		int[] arr = {4, 3, 6, 2, 1, 1};
        int n = arr.length;
        int[] result = findTwoElement(arr, n);
        System.out.println("Repeating: " + result[0]);
        System.out.println("Missing: " + result[1]);
	}

}
