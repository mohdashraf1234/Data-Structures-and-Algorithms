package com.Math;

public class checkNumberISPerfectOrnot {
	
	 static int perfect(int n)
	{
		int sum=0;
		for(int i=1;  i<n; i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	// example-6-->1+2+3  =6 , sum of  divisor should be equals to original number
	public static void main(String[] args) {
		int n=28;
		int res=perfect(n);
		
		if(res==n)
		{
			System.out.println("Number is perfect");
		}
		else
		{
			System.out.println("Number  is not perfect");
		}
	}

}
