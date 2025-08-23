package com.stringsss;

public class CheckIfStringsAreRotationsOfEachOther_5 {
	public  static void  main(String[] args)
	{
		String s1="ABCD";
		String s2="CDAB";

		if(s1.length()!=s2.length())
		{
			System.out.println("Not a rotation");
			return;
		}
		String s3=s1+s1;
/*
 contains("power") checks if the substring "power" is present anywhere in the string "Java is powerful".

It is case-sensitive, so "Power" (with capital P) would return false. 
 * */
		if(s3.contains(s2))
		{
			System.out.println("Rotation");
		}
		else
		{
			System.out.println("Not rotation");
		}
	}


}
