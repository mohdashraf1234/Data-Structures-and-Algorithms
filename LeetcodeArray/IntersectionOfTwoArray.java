package com.leetcode.array;
import java.util.*;
public class IntersectionOfTwoArray {
	
	 public static int[] intersect(int[] nums1, int[] nums2) {
	        Set<Integer> set = new HashSet<>();
	        List<Integer> result = new ArrayList<>();

	        // Add all elements of nums1 into the set
	        for (int x : nums1) {
	            set.add(x);
	        }

	        // Check each element in nums2
	        for (int x : nums2) {
	            if (set.contains(x)) {
	                result.add(x);   // add to result
	                set.remove(x);   // remove to avoid duplicates
	            }
	        }

	        // Convert List -> int[]
	        int[] output = new int[result.size()];
	        for (int i = 0; i < result.size(); i++) {
	            output[i] = result.get(i);
	        }

	        return output;
	    }
	public static void main(String[] args) {
		
		    int[] nums1 = {1,2,2,1};
	        int[] nums2 = {2,2};

	        int[] ans = intersect(nums1, nums2);
	        System.out.println("Output: " + Arrays.toString(ans));
	}

}

