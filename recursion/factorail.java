package com.recursion;

public class factorail {
    public static void main(String[] args) {
        System.out.println(fact(5)); // Output: 120
    }

    static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1); // fixed recursive call
    }
}
