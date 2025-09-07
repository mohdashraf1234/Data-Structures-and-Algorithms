package com.leetcode.string;

public class reverseInteger {
	public int reverse(int x) {
        long rev = 0; // Use long to check overflow safely

        while (x != 0) {
            int digit = x % 10;   // Take last digit
            rev = rev * 10 + digit; // Append digit
            x /= 10;              // Remove last digit
        }

        // If rev is out of 32-bit int range, return 0
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) rev;
    }
	public static void main(String[] args) {
		
		reverseInteger solution = new reverseInteger();

        System.out.println(solution.reverse(123));   // Output: 321
        System.out.println(solution.reverse(-123));  // Output: -321
        System.out.println(solution.reverse(120));   // Output: 21
        System.out.println(solution.reverse(1534236469)); // Output: 0 (overflow)
		
	}

}
