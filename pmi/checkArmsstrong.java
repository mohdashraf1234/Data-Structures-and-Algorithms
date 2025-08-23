package com.pmi;
import java.util.*;
public class checkArmsstrong {


	public static void main(String[] args) {
//		int n=153;
//		int temp=n;
//		int sum=0;
//		while(n>0)
//		{
//			int d=n%10;
//			sum=sum+d*d*d;
//			n=n/10;
//		}
//		if(sum==temp)
//		{
//			System.out.println("Armsstrong");
//		}
//		else
//		{
//			System.out.println("Not Armsstrong");
//		}
		
		int n=153;
		int  temp=n;
		int digits=String.valueOf(n).length();
		int sum=0;
		int num=n;
		while(num>0)
		{
			int d=num%10;
			sum += Math.pow(d, digits);
			num=num/10;
			
			
		}
		if(sum==temp)
		{
			System.out.println("Ok");
		}
		else
		{
			System.out.println("Not  ok");
		}
//		step1-n storein temp
//		step2- find  size String.valueOf(n).length()
//		step3-inside  loop  sum=sum+Math.pow(d,digits)
//		step4- compare

	}
}
