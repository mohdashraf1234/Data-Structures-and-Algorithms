package com.array;

public class MaximumProductOfAtriplet_6 {
	public static int maxProduct(int[] arr) {
		int n = arr.length;
		int maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					maxValue = Math.max(maxValue, arr[i] * arr[j] * arr[k]);
				}
			}
		}
		return maxValue;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 3, 5, 6, 20 };
		int res = maxProduct(arr);
		System.out.println(res);
		
		
		
		//2nd approcah but  only can handle +ve  numbers  not -ve
		/*for(int i=0;  i<arr.length;i++)
		{
			for(int j=i+1;  j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int result=0;
		for(int i=0;  i<arr.length;i++)
		{
			 result=arr[0]*arr[1]*arr[2];
		}
		System.out.println(result);*/
	}
}
