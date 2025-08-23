package com.pmi;

import java.util.HashSet;
import  java.util.*;
public class RemoveDuplicateFromAnArray15 {
	public static void main(String[] args) {
		int[] num= {1,3,4,5,6,6,7,7,34};
		HashSet<Integer> hs=new  HashSet<>();
		for(int i=0;  i<num.length;i++)
		{
			hs.add(num[i]);
		}
		for(int dup:hs)
		{
			System.out.print(dup+"  ");
		}
		
		//------------------by stream----
		
		int[] unique = Arrays.stream(num)
                .distinct()
                .toArray();

        System.out.println("Without duplicates: " + Arrays.toString(unique));
		
		
	}

}
