package com.pmi;

public class SecondLargestELementInAnArray_6 {
	public static void main(String[] args) {
		int[] arr= {3,4,5,5,6,33,56};
		for(int i=0;  i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[1]);
	}

}
