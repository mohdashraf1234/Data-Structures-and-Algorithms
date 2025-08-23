package com.Math;

import java.util.Scanner;

public class AmsNumber {
	public static void main(String[] args) {
		/*int n=153;
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int d=n%10;
			sum=sum+d*d*d;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Ok");
		}
		else
		{
			System.out.println("Not ok");
		}*/
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int digits = String.valueOf(n).length(); // Count digits
        int sum = 0;

        while (n > 0) {
            int d = n % 10;
            sum += Math.pow(d, digits); // Raise digit to power of number of digits
            n = n / 10;
        }

        if (temp == sum) {
            System.out.println(temp + " is an Armstrong number.");
        } else {
            System.out.println(temp + " is NOT an Armstrong number.");
        }

        sc.close();
		
	}

}
