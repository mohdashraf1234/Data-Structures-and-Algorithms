package com.pmi;

public class countELementOddAndEvenInList_2 {
	public static void main(String[] args) {		
		int[] arr= {3,44,12,6,100,7,5,54};
		int countEven=0;
		int countOdd=0;
		for(int i=0;  i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				countEven++;
			}
			else
			{
				countOdd++;
			}
		}
		System.out.println("Total Even:"+countEven);
		System.out.println("Total odd:"+countOdd);	
	}

}
