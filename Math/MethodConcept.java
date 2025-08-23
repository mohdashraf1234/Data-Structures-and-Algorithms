package com.Math;

public class MethodConcept {
	public static int add(int a,int b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		
		int result=add(80,90);
		if(result%2==0)
		{
			System.out.println("Result is  even");
		}
		else
		{
			System.out.println("Result is odd");
		}
	}

}
