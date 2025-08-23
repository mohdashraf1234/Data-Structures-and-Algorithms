package com.pmi;

import java.util.Arrays;

public class MergeTwoSortedArrayIntoOne {
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4};
		int[] arr2= {7,8,9,0};
		int[] arr3=new int[arr1.length+arr2.length];
		
		//iterate first array
		for(int i=0; i<arr1.length;i++)
		{
			arr3[i]  =     arr1[i];
			//{1,2,3,4,0,0,0,0}
		}
		for(int i=0;  i<arr2.length;i++)
		{
			//{0+4}
			//{1,2,3,4,7,8,9,0}
			//that means arr2 store in arr3 aftter 4 length
			arr3[i+arr1.length]=arr2[i];
		}
//		for(int i=0; i<arr3.length; i++)
//		{
//			System.out.print(arr3[i]+" ");
//		}
		System.out.println(Arrays.toString(arr3));
		
	}

}
