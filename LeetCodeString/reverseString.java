package com.leetcode.string;

public class reverseString {
    public static void reverseString1(char[] s) {
        int start = 0, end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString1(s);
        
        // Print reversed string
        System.out.println(new String(s)); // output: "olleh"
    }
}
