package com.Math;

public class sumOfEachEvenDigit {
	public static int sumOfEvenDigit(int n)
	{
		int sum=0;
		while(n>0)
		{
			
			int d=n%10;
			if(d%2==0)
			{
				sum=sum+d;
			}
			
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sumOfEvenDigit(12345));
	}

}
