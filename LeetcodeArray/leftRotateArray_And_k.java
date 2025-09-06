package com.leetcode.array;

public class leftRotateArray_And_k {
	static int[] leftrotate(int[] arr,int k)
	{
		for(int  j=0; j<k; j++)
		{
			int first=arr[0];
			for(int i=0;i<arr.length-1; i++)
			{
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=first;
		}
		return arr;
		
	}
	public static void main(String[] args) {
		int [] arr= {2,31,4,5,6,8,12};
		int k=2;
		int[] res=leftrotate(arr,k);
		for(int  val:res)
		{
			System.out.print(val+" ");
		}
	}

}
