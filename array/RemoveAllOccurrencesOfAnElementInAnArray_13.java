package com.array;

public class RemoveAllOccurrencesOfAnElementInAnArray_13 {
	public  static  void main(String[] args)
	{
		 int[] arr = {0, 1, 3, 0, 2, 2, 4, 2};
	        int ele = 2;
	        int index=0;
	        for(int i=0; i<arr.length; i++)
	        {
	        	if(arr[i]!=ele)
	        	{
	        		arr[index]=arr[i];
	        		index++;
	        	}
	        }
	        System.out.println(index);
	        
		
		
	}

}
