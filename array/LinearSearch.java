package com.top.thirteen.ques;

public class LinearSearch {
	public static int linearsearchh(int[] arr,int target)
	{
		for(int i=0;i<arr.length;   i++)
		{
			if(arr[i]==target)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {3, 44, 12, 6, 100, 7, 5, 54};
		int target=54;
		System.out.println(linearsearchh(arr,target));
	}

}
