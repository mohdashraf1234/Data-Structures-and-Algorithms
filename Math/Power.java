package com.Math;

public class Power {
	public static int power(int base)
	{
		int exp=4;
		int pow=1;
		while(exp>0)
		{
			pow=pow*base;
			exp--;
		}
		return pow;
	}
	public static void main(String[] args) {
		System.out.println(power(2));
	}

}
