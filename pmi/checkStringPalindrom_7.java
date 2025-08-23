package com.pmi;

public class checkStringPalindrom_7 {
	public static void main(String[] args) {
		
		String str="Abba";
		str=str.toLowerCase();
		
		String rev="";
		for(int i=str.length()-1;i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("NotPalindrom");
		}
//------------------------		
		
//		String s = "Abba";
//        s = s.toLowerCase(); 
//
//        StringBuilder rev = new StringBuilder();
//        for (int i = s.length() - 1; i >= 0; i--) {
//            rev.append(s.charAt(i));
//        }
//
//        if (rev.toString().equals(s)) {
//            System.out.println("This is a palindrome");
//        } else {
//            System.out.println("This is not a palindrome");
//        }
		
		
		
	}

}
