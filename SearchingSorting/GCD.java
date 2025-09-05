package Searchingu.Sorting;
import  java.util.*;
public class GCD {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1 :");
		int number1=sc.nextInt();
		System.out.println("Enter Number 2");
		int number2=sc.nextInt();
		while(number1!=number2)
		{
			if(number1>number2)
				number1=number1-number2;
			if(number2>number1)
				number2=number2-number1;
			
		}
		System.out.println("GCD is:"+number1);
		
	}

}
