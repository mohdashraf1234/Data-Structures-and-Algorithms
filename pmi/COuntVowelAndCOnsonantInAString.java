package com.pmi;

public class COuntVowelAndCOnsonantInAString {
	public static void main(String[] args) {
		 String str = "Hello World";
	        str = str.toLowerCase();  // ignore case

	        int vowels = 0, consonants = 0;

	        char[] ch=str.toCharArray();
	        for(int i=0;i<ch.length-1;i++)
	        {
	        	if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' )
	        	{
	        		vowels++;
	        	}
	        	else
	        	{
	        		consonants++;
	        	}
	        }

	        System.out.println("Vowels: " + vowels);
	        System.out.println("Consonants: " + consonants);
	}

}
