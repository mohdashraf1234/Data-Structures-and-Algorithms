package com.Math;

public class fiboWithRecusion {
	public static int fibo(int n)
	{
		if(n<=1)
		{
			return n;
		}
		return fibo(n-1) + fibo(n-2);
	}
	public static void main(String[] args)
	{
		int terms=10;
		for(int i=1; i<=terms; ++i)
		{
			System.out.println(fibo(i));
		}
	}

}
