package com.Math;

public class count {
	public static void main(String[] args) {
		Long n=99383938393L;
		int i=0;
		while(n>0)
		{
			Long d=n%10;
			i++;
			n=n/10;
		}
		System.out.println(i);
	}

}
