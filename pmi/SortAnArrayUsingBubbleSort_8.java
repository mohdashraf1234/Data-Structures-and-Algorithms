package com.pmi;

public class SortAnArrayUsingBubbleSort_8 {
	public static void main(String[] args) {
		int[] arr= {3,4,5,5,6,33,56};
		for(int i=0;  i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;  i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
