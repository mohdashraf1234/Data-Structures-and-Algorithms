package com.Math;

public class fibonacciSeriesByRecursion {
	static int fibo(int n)
	{
		if(n<=1)
		{
			return n;
		}
		return fibo(n-1)  +  fibo(n-2);
	}
	public static void main(String[] args) {
		int times=5;
		for(int i=0;  i<=times;i++)
		{
			System.out.print(fibo(i)+" ");
		}
		
	}

}
