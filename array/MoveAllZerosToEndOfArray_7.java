package com.array;

public class MoveAllZerosToEndOfArray_7 {
	public static void main(String[] args) {

		int arr1[] = {1, 2, 0, 4, 3, 0, 5, 0};
		int arr2[] =new int[arr1.length];

		int index=0;
		for(int i=0;  i<arr1.length;i++)
		{
			if(arr1[i]!=0)
			{
				arr2[index]=arr1[i];
				index++;
			}
		}
		for(int i=0;  i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		//input -arr1 = {1, 2, 0, 3}   ,sample solution
				/* i	arr1[i]	Condition	Action	index	arr2
         0	1	✅ Not 0	arr2[0] = 1, index++	1	{1, 0, 0, 0}
         1	2	✅ Not 0	arr2[1] = 2, index++	2	{1, 2, 0, 0}
         2	0	❌ Is 0	nothing happens	2	{1, 2, 0, 0} (unchanged)
         3	3	✅ Not 0	arr2[2] = 3, index++	3	{1, 2, 3, 0}*/


		/*
          int arr2[] = new int[arr1.length];  // arr2 = {0, 0, 0, 0}
int index = 0;

for (int i = 0; i < arr1.length; i++) {
    if (arr1[i] != 0) {
        arr2[index++] = arr1[i];
    }
}

		 */

	}
}

