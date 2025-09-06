package com.leetcode.array;

public class RemoveDuplicateFromSortedArray {
	static int removeDuplicate(int[] arr)
	{
		int count=0;
		for(int i=0; i<arr.length;i++)
		{
			if(i<arr.length-1 && arr[i]==arr[i+1])
			{
				continue;
			}
			else
			{
				arr[count]=arr[i];
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr= {0,0,1,1,1,2,2,3,3,4};
		int res=removeDuplicate(arr);
		System.out.println(res);
	
		
	}

}
//https://www.youtube.com/watch?v=xnj-GjdboGE
