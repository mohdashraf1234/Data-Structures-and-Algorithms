package com.Math;

public class fibonacciseries {
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		//F.S by using while loop
//		int count=1;
//		while(count<=10)
//		{
//			int c=a+b;
//			System.out.println(c);
//			a=b;
//			b=c;
//			count++;
//		}
		
		//by using for loop
		for(int i=1; i<=5; i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
