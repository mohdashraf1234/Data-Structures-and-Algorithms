package com.DP;


public class LongestCommonSubsequence {

    // Function to find LCS length
    public static int lcs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // DP table
        int[][] dp = new int[m + 1][n + 1];

        // Bottom-up approach
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "ABCBDAB";
        String s2 = "BDCAB";

        int result = lcs(s1, s2);
        System.out.println("Length of Longest Common Subsequence: " + result);
    }
}
