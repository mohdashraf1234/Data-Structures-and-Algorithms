package com.top.thirteen.ques;

import java.util.Arrays;

public class reverseArrayByTwoPointer {
	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 4, 5};
		 int left=0, right=arr.length-1;
		 if(left<right)
		 {
			 int temp=arr[right];
			 arr[right]=arr[left];
			 arr[left]=temp;
			 left++;
			 right--;
		 }
		 System.out.println(Arrays.toString(arr));
	}

}
