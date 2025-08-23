package com.Math;

public class sumOfEachDigitByMethod {
	public static int sum(int n)
	{
		
		
		int sum=0;
		while(n>0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		return sum;

	}
	public static void main(String[] args) {
		
		System.out.println(sum(1234));	
	}

}
