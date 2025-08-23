package com.array;

public class StockuyAndSell_Max_one_TransactionAllowed_11 {
	public static int  maxProfit(int[] prices)
	{
		
		int res=0;
		for(int i=0; i<prices.length-1;i++)
		{
			for(int j=i+1; j<prices.length; j++)
			{
				res=Math.max(res,prices[j]-prices[i]);
			}
		}
		return res;
	}
	public static void main(String[] args)
	{
		int[] prices = {1, 3, 6, 9, 11};
		
		System.out.println(maxProfit(prices));
		
	}
	

}
