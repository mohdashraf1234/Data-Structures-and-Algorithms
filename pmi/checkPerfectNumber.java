package com.pmi;

public class checkPerfectNumber {
	public static void main(String[] args) {

		for(int j=1; j<=500; j++)
		{
			int sum=0;
			for(int i=1; i<=j/2;  i++)
			{
				if(j%i==0)
				{
					sum=sum+i;
				}
			}
			if(sum==j)
			{
				System.out.println("Perfect  Numbers:"+j);
			}
			
		}
		

	}

}
