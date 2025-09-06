package com.leetcode.array;

public class rightRotateArray_And_k {
//	static int[] rightrotate(int[] arr,int k)
//	{
//		for(int j=0;  j<k; j++)
//		{
//			int last=arr[arr.length-1];
//			for(int i=arr.length-1; i>0;  i--)
//			{
//				arr[i]=arr[i-1];
//			}
//			 arr[0]=last;
//		}
//		
//		 
//		 return arr;
//	}
	
	//optimize approach
	private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
	
	   public void rotate(int[] nums, int k) {
	        int n = nums.length;
	        k = k % n; // handle k > n
	        
	        reverse(nums, 0, n - 1);        // reverse entire array
	        reverse(nums, 0, k - 1);        // reverse first k elements
	        reverse(nums, k, n - 1);        // reverse remaining elements
	    }
	public static void main(String[] args) {
		int [] arr= {-1,-100,3,99};
//		int k=2;
//		int[] res=rightrotate(arr,k);
//		for(int val: res)
//		{
//			System.out.print(val+"  ");
//		}
		
		
		//----------
		
		
		
		
		
	}

}
