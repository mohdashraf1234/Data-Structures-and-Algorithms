package com.pmi;

public class RotateAnArrayLeftByK18 {
	public static void main(String[] args) {
		//left rotate  array
		int[] arr= {1,3,4,5,6};
		int first=arr[0];
		for(int i=0;  i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=first;
		for(int i=0;  i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

		//  right rotate array

		int[] arr1 = {1, 3, 4, 5, 6};

		int last = arr1[arr1.length - 1]; // store last element

		// shift elements to the right
		for (int i = arr1.length - 1; i > 0; i--) {
			arr1[i] = arr1[i - 1];
		}

		// put last element at the start
		arr1[0] = last;

		// print result
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}




	}

}
