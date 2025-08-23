package com.stringsss;

public class StringPalindrom {
	public static void main(String[] args) {
		String str="dad";
		char[] ch=str.toCharArray();
		String rev="";
		for(int i=ch.length-1;  i>=0; i--)
		{
			rev=rev + str.charAt(i);
		}
		if(rev.equals(rev))
		{
			System.out.println("THis is  palindrom");
		}
		else
		{
			System.out.println("This is not palindrom");
		}
		
	}

}
