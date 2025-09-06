package com.leetcode.array;

public class SellBuyStock2 {
  static int maxProfit(int[] prices)
  {
	  int profit=0;
	  for(int i=1; i<prices.length;i++)
	  {
		  if(prices[i]>prices[i-1])
		  {
			  profit=profit+(prices[i]-prices[i-1]);
		  }
	  }
	  return profit;
  }
	public static void main(String[] args) {
		int[] prices = {1,2,3,4,5};
		int res=maxProfit(prices);
		System.out.println(res);
	}
	

}
//https://www.youtube.com/watch?v=Q7v239y-Tik