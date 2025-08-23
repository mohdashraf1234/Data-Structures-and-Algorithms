package com.stringsss;

import java.util.Arrays;

public class twoStringAreAnagram {
	public static void main(String[] args) {
		String str1="Brag";
		String str2="Grabd";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length()!=str2.length())
		{
			System.out.println("This  is not anagram");
		}
		else
		{
			char[] ch1=str1.toCharArray();
			char[] ch2=str2.toCharArray();
		    Arrays.sort(ch1);
		    Arrays.sort(ch2);
		    if(Arrays.equals(ch1, ch2)==true)
		    {
		    	System.out.println("This is anagram");
		    }
		    else
		    {
		    	System.out.println("This  is not anagram");
		    }
		}
		/*
		 * lowercase 
		 * if  else
		 * convert into array
		 * sort
		 * compare 
		 */
		
		
		
	}

}
