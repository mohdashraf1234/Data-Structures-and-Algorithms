package com.array;

public class FindingSumOfDigitsOfA_numberUntilSumBecomesSingleDigit_5 {
	public static void main(String[] args) {

//		int n=5674;
//		int sum=0;
//		
//		while(n>0)
//		{
//			int d=n%10;
//			sum=sum+d;
//			n=n/10;
//		}
//		int result1=sum;
//		int sum1=0;
//		while(result1>0)
//		{
//			int d2=result1%10;
//			sum1=sum1+d2;
//			result1=result1/10;
//		}
//		System.out.println(sum1);
		
		int n = 73738;

        while (n >= 10) {  // repeat until single digit
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n = n / 10;
            }
            n = sum;  // update n with the sum of digits
        }

        System.out.println(n);  // final single-digit result
		



	}

}

