package com.array;

public class StockBuy_andSell_MultipleTransactionAllowed_12 {
	static int maxProfit(int[] prices)
	{
		int profit=0;
		for(int i=1;i<prices.length;i++)
		{
			if(prices[i]>prices[i-1])
			{
				profit=profit+(prices[i]-prices[i-1]);
			}
		}
		return profit;
	}
	public  static void main(String[]  args)
	{
		//https://www.youtube.com/watch?v=Q7v239y-Tik
		
		int[] prices = {100, 180, 260, 310, 40, 535, 695};
		System.out.println(maxProfit(prices));
		
	}

}
