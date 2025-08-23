package com.array;

import java.util.Arrays;

public class MissingNumbers_14 {
	//https://www.youtube.com/watch?v=3y25EaWckO4
//	public  static int MissingNum(int[] num)
//	{
//		int n=num.length;
//		return n*(n+1)/2 - Arrays.stream(num).sum();
//	}
	
	//2nd approach 
	
	public  static int MissingNum(int[] num)
	{
		int res=0;
		for(int i=0; i<num.length;i++)
		{
			res=res^i^num[i];
		}
		return res^num.length ;
	}
	
	/*
	 int[] num = {3, 0, 1} // Missing = 2
Length = 3

Now dry run:

Initial res = 0

i	num[i]	res = res ^ i ^ num[i]
0	3	0 ^ 0 ^ 3 = 3
1	0	3 ^ 1 ^ 0 = 2
2	1	2 ^ 2 ^ 1 = 1

Final step:

nginx
Copy
Edit
res ^ num.length = 1 ^ 3 = 2 ✅
	 */
	
	
	public static void main(String[] args) {
		int [] num= {3, 0, 1};
		System.out.println(MissingNum(num));
	}

}
