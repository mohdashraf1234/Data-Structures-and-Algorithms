package com.pmi;

public class maxElementInArray_1 {
	public static void main(String[] args) {
		int[] arr= {3,44,12,6,100,7,5,54};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
