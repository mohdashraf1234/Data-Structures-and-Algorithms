package com.algorithm;

public class Binary_SearchAlgo {
	public static void  BS2(int[] arr,int first, int last,  int key)
	{
		int mid=(first+last)/2;
		while(first<=last)
		{
			if(arr[mid]<key)
			{
				first=mid+1;
			}
			else if(arr[mid]==key)
			{
				System.out.println("Index element is found:"+mid);
				break;
			}
			else
			{
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last)
		{
			System.out.println("Element  is not found ...");
		}
	}
	
	public static void main(String[] args) {
		int [] arr= {10,20,30,40,50,60,70,80,90,100,110,120,130};
		int key=40;
		int last=arr.length-1;
		BS2(arr,0,last,key);
		
	}

}
