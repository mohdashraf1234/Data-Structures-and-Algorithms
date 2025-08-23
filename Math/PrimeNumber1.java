package com.Math;

public class PrimeNumber1 {
	public static void main(String[] args) {

		//int n=2;
	
			for(int n=1; n<=100; n++)
			{
				int count=0;
				for(int i=2; i<=n; i++)
				{
					if(n%i==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.println(n+":Prime number");
				}		

			}


		


	}

}
