package com.leetcode.array;

public class sellStock {
	static int  sell(int[] prices)
	{
		int profit=0;
		for(int i=0;i<prices.length;i++)
		{
			for(int j=i+1; j<prices.length;j++)
			{
				profit=Math.max(profit, prices[j]-prices[i]);
			}
		}
		return profit;
	}
	public static void main(String[] args) {
		int[] prices= {1,2,3,4,5};
		int res=sell(prices);
		System.out.println(res);
	}

}

