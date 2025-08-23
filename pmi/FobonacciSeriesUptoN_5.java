package com.pmi;

public class FobonacciSeriesUptoN_5 {
	static  int fibo(int n)
	{
		if(n<2)
		{
			return n;
		}		
		return fibo(n-1)+fibo(n-2);
	}
	public static void main(String[] args) {

		int n=5;
		for(int i=1;i<=n;  i++)
		{
			System.out.println(fibo(i));
		}
	}

}
