package com.Math;

public class PerfectSquare {
	public static void main(String[] args)
	{
		int n = 49;
		double sqrt = Math.sqrt(n);

		if (sqrt == (int) sqrt) {
			System.out.println(n + " is a Perfect Square");
		} else {
			System.out.println("Not perfect");
		}

	}
}
