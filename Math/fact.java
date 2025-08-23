package com.Math;

public class fact {
	public static void main(String[] args) {
//		int  n;
//		int fact=1;
//		for(n=1; n<=5; n++)
//		{
//			fact=fact*n;
//		}
//		System.out.println(fact);
		
		
		int n=5;
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		System.out.println(fact);
	}

}
