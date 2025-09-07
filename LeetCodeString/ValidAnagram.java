package com.leetcode.string;

import java.util.Arrays;

public class ValidAnagram {
	public  static boolean isAnagram(String s, String t)
	{
		s=s.toLowerCase();
		t=t.toLowerCase();
		if(s.length()!=t.length())
		{
			System.out.println("Not Angram");
		}
		
		char[] ch1=s.toCharArray();
		char[] ch2=t.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch1);
		
	}
	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		boolean res=isAnagram(s,t);
		System.out.println(res);
		
				
		
	}

}
