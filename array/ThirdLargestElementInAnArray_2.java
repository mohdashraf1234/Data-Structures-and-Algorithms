package com.array;

public class ThirdLargestElementInAnArray_2 {
	public  static  void main(String[] args)
	{
		int arr[] = {12, 35, 1, 10, 34, 1};
		for(int i=0; i<arr.length;  i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[2]);
	}

}
