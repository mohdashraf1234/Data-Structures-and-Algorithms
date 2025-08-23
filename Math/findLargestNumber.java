package com.Math;

import java.util.Scanner;

public class findLargestNumber {
	public static void main(String[] args)
	{
		int a,b,c,largest,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1");
		 a=sc.nextInt();
		 System.out.println("Enter number 2");
		 b=sc.nextInt();
		 System.out.println("Enter number 3");
		 c=sc.nextInt();
		 
		  temp=a>b ? a:b;
		  largest=c>temp ? c:temp;
		  System.out.println(largest+"is largest Number");
		 
		
		
	}

}
