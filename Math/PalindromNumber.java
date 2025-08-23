package com.Math;

public class PalindromNumber {
	public static void main(String[] args) {
		
		int n=122;
		int temp=n;
		int reverse=0;
		while(n!=0)
		{
			int d=n%10;
			reverse=reverse*10 + d;
			n=n/10;
		}
		if(reverse==temp)
		{
			System.out.println("Palindrom NUmber");
		}
		else
		{
			System.out.println("Not Palindrom number");
		}
	}

}
