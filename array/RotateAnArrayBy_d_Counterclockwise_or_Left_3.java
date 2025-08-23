package com.array;

public class RotateAnArrayBy_d_Counterclockwise_or_Left_3 {
	public  static void leftRotate(int[] arr,  int d)
	{
	
		for(int i=0; i<d; i++)
		{
			int first=arr[0];
			for(int j=0; j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=first;
		}
	}
	public static void main(String[] args) {
		//Rotate an Array by d - Counterclockwise or Left
		int arr[] = {1, 2, 3, 4, 5, 6};
		int d=2;
		leftRotate(arr, d);
		for(int j=0; j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}

		
	}
	
}
