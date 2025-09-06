package com.leetcode.array;


public class PlusOne {
	public static int[] plusOne(int[] digits) {
	       int n = digits.length;

	        // Traverse from last digit to first
	        for (int i = n - 1; i >= 0; i--) {
	            if (digits[i] != 9) {
	                digits[i]++;   // If digit < 9, just add 1
	                return digits; // Done, return
	            }
	            digits[i] = 0;     // If digit == 9, make it 0 and carry over
	        }

	        // If all digits were 9 (e.g., 999 -> 1000)
	        int[] res = new int[n + 1];
	        res[0] = 1;
	        return res;
	    }
	public static void main(String[] args) {
		int[] digits = {4,3,2,1};
		int[] res=plusOne(digits);
		for(int val:res)
		{
			System.out.print(val+" ");
		}
		//https://www.youtube.com/watch?v=8fbzKTSCvzo
	}

}
