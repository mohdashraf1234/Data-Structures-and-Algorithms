package Searchingu.Sorting;

public class BS1 {
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
}

