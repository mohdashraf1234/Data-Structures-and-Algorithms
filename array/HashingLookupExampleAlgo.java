package com.array;

import java.util.HashSet;

public class HashingLookupExampleAlgo {
	public static void main(String[] args) {
		    int[] arr = {3, 7, 1, 9, 5};

	        // Step 1: Put all elements in a HashSet
	        HashSet<Integer> set = new HashSet<>();
	        for (int num : arr) {
	            set.add(num);
	        }

	        // Step 2: Lookup in O(1)
	        int target = 7;
	        if (set.contains(target)) {
	            System.out.println(target + " is found!");
	        } else {
	            System.out.println(target + " is not found!");
	        }
	}

}
