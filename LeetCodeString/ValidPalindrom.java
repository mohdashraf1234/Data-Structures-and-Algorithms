package com.leetcode.string;

public class ValidPalindrom {

	    public boolean isPalindrome(String s) {
	        int p1 = 0, p2 = s.length() - 1;
	        s = s.toLowerCase(); // convert to lowercase

	        while (p1 < p2) {
	            char ch1 = s.charAt(p1);
	            char ch2 = s.charAt(p2);

	            // Skip non-alphanumeric characters for p1
	            if (!(ch1 >= 'a' && ch1 <= 'z' || ch1 >= '0' && ch1 <= '9')) {
	                p1++;
	                continue;
	            }

	            // Skip non-alphanumeric characters for p2
	            if (!(ch2 >= 'a' && ch2 <= 'z' || ch2 >= '0' && ch2 <= '9')) {
	                p2--;
	                continue;
	            }

	            // If characters don't match → not palindrome
	            if (ch1 != ch2) {
	                return false;
	            }

	            // Move both pointers
	            p1++;
	            p2--;
	        }

	        return true;
	    }
	

	public static void main(String[] args) {
		ValidPalindrom  v=new ValidPalindrom();
		String s="race a car";
		boolean res=v.isPalindrome(s);
		System.out.println(res);
		
		
//		String s="Mom";
//		s=s.toLowerCase();
//		String rev="";
//		for(int i=s.length()-1;i>=0; i--)
//		{
//			rev=rev+s.charAt(i);
//		}
//		if(rev.equals(s))
//		{
//			System.out.println("Palindrom");
//		}
//		else
//		{
//			System.out.println("Not Palindrom");
//		}
	}
    
}
