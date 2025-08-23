package com.algorithm;

public class linearSearch {
	public static void main(String[] args) {
		int[] arr= {3,2,4,4,5};
		for(int i=0; i<arr.length;  i++)
		{
			for(int j=i+1; j<arr.length; j++ )
			{
				if(arr[i]==arr[j] && (i!=j))
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
	

}
