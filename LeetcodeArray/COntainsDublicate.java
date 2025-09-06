package com.leetcode.array;

import java.util.HashSet;

public class COntainsDublicate {
	static boolean checkDup(int[] nums)
	{
		HashSet<Integer> hs=new HashSet<>();
		for(int num : nums)
		{
			if(!hs.add(num))
			{
				return true;
			}
		}
		return false;
	}
	
	// class Solution {
//  public boolean containsDuplicate(int[] nums) {
     

     
//      for(int i=0; i<nums.length; i++)
//      {
//          for(int j=i+1; j<nums.length; j++)
//          {
//              if(nums[i]==nums[j])
//              {

//                return true;
//              }
            
//          }
//      }
//      return false;
//  }
//}

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		boolean res=checkDup(nums);
		System.out.println(res);
		
	}

}
