package com.stringsss;

public class countTotalNumbersOfVovelsAndConsonant {
	public static void main(String[] args)
	{
		String str="java is a object oriented programming language..";
		char[] ch=str.toCharArray();
		int vCount=0;
		int cCount=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				vCount++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				cCount++;
			}
		}
		System.out.println(vCount);
		System.out.println(cCount);
		
	}

}
