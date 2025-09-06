package com.leetcode.array;

public class twoSum {
	static int[] twosum(int[] arr,int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length; j++)
			{
				if(arr[i]+arr[j]==target)
				{
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}
	public static void main(String[] args) {
		int[] arr= {2,3,4,5,6,7};
		int target=9;
		int[] result=twosum(arr,target);
		for(int val:result)
		{
			System.out.print(val+" ");
		}
		
		//we can optimize by using HashMap<Integer, Integer> map = new HashMap<>(); // number -> index
	}

}
