package com.leetcode.array;
import java.util.*;
public class countDistinctElement {
	public static void main(String[] args) {
		int[] arr= {1,2,2,1,1,3};
		HashSet<Integer> hs=new HashSet<>();
		for(int element :arr)
		{
			hs.add(element);
		}
		 // Print distinct elements
        System.out.println("Distinct Elements: " + hs);
        
        // Print count of distinct elements
        System.out.println("Count of Distinct Elements: " + hs.size());
		
		
	}

}
