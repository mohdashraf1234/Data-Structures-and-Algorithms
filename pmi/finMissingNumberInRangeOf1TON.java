package com.pmi;

import java.util.Arrays;

public class finMissingNumberInRangeOf1TON {
	static int missingNum(int[] num)
	{
		int n=num.length+1;
		return n*(n+1)/2 - Arrays.stream(num).sum();
	}
	public static void main(String[] args) {
		int[] num= {1,3,4,5};
		int res=missingNum(num);
		System.out.println(res);
		
		
	}

}
