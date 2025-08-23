package com.Math;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
//		Scanner  sc=new Scanner(System.in);
//		System.out.println("Enter number...");
//		int n=sc.nextInt();
//		
//		int sum=0;
//		for(int i=1; i<n; i++)
//		{
//			if(n%i==0)
//			{
//				sum=sum+i;
//			}
//		}
//		if(n==sum)
//		{
//			System.out.println("Number is perfect");
//		}
//		else
//		{
//			System.out.println("Number  is  not perfect");
//		}
		
		
		 System.out.println("Perfect numbers between 1 and 1000 are:");

	        for (int n = 1; n <= 100; n++) {
	            int sum = 0;

	            // Check for divisors
	            for (int i = 1; i < n; i++) {
	                if (n % i == 0) {
	                    sum += i;
	                }
	            }

	            if (sum == n) {
	                System.out.println(n);
	            }
	        }
	}

}
