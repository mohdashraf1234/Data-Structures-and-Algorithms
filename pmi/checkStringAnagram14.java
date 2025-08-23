package com.pmi;

import java.util.Arrays;

public class checkStringAnagram14 {
	public static void main(String[] args) {
		String str1="LISTEN";
		String str2="SILENT";
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Not Anagram");
		}
		else
		{
			char[] ch1=str1.toCharArray();
			char[] ch2=str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2)==true)
			{
				System.out.println("Thisn is Anagaram!");
			}
			else
		    {
		    	System.out.println("This  is not anagram");
		    }
			
			
		}
	}

}
