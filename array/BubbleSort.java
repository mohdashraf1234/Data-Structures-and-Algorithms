package Searchingu.Sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {15, 9, 7, 13, 12, 16, 4, 18, 11};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length;  j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
