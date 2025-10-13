package com.recursion;

public class BS {
	public static void main(String[] args) {
		int[] arr= {1,2,3,44,55,66,100};
		int target=44;
		System.out.println(bs1(arr,target,0,arr.length-1));

		
	}
	static int bs1(int[] arr,int target,int s,  int e)
	{
		if(s>e)
		{
			return -1;
		}
		int m=s+(e-s)/2;
		if(arr[m]==target)
		{
			return m;
		}
		if(target<arr[m])
		{
			return bs1(arr,target,s,m-1);
		}
		return bs1(arr,target,m+1,e);
	}

}
