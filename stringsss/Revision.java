package com.stringsss;

import java.util.Arrays;

public class Revision {
	public static void main(String[] args)
	{
		
		
		//1.Write a Java program to count the total number of characters in a string (excluding spaces).
		
		/*String str="This is me";
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]!=' ')
			{
				count++;
			}
			
			
		}
		System.out.println(count);*/
		
		
		//2.Write a Java program to count the number of punctuation marks in a string.
		
		/*String str="Hello! My name is John, and I love programming. Do you? Well, let's start: Java, Python, and C++ are my favorites. Isn't that cool?\r\n"
				+ "\r\n"
				+ "";
		int count=0;
		char[] ch=str.toCharArray();
		for(int i=0; i<ch.length-1; i++)
		{
			if(ch[i] == '!' || ch[i] == ',' || ch[i] == '.' || ch[i] == '?' || 
	                ch[i] == ':' || ch[i] == '\'' || ch[i] == '+')
				{
						count++;
				}
		}
		System.out.println(count);*/
		
		
	//	3.Write a Java program to count the total number of vowels and consonants in a given string.
		
	/*String str="Hello! My name is John, and I love programming. Do you? Well, let's start: Java, Python, and C++ are my favorites. Isn't that cool?";
	char[] ch=str.toLowerCase().toCharArray();
	int vCount=0;
	int cCount=0;
	for(int i=0; i<ch.length;i++)
	{
		
		if(ch[i]>'a'&& ch[i]<'z')
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='o' || ch[i]=='u' || ch[i]=='i')
			{
				vCount++;
			}
			else
			{
				cCount++;
			}
		 
		}
	}
	System.out.println("Numbers  of vowels :"+vCount);
	System.out.println("Number of Consonent:"+cCount);*/
		
		
		//4.Write a Java program to find and print all duplicate characters in a string.
		/*String str = "Delhi is a capita";
        char[] ch = str.toCharArray();
        boolean[] visited = new boolean[ch.length];

        for (int i = 0; i < ch.length; i++) {
            if (visited[i] || ch[i] == ' ') continue;

            int count = 1;

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            if (count > 1) {
                System.out.println("Character '" + ch[i] + "' appears " + count + " times.");
            }
        }*/
		
		//5.Write a Java program to find the longest and shortest word in a given string.
		/*String  str="Education is mandatory";
		String[] words=str.split(" ");
		String longest=words[0];
		String smallest=words[0];
		for(int i=0; i<words.length; i++)
		{
			if(words[i].length()>longest.length())
			{
				longest=words[i];
			}
			if(words[i].length()<longest.length())
			{
				smallest=words[i];
			}
		}
		System.out.println(longest);
		System.out.println(smallest);*/
		
		//6.Write a Java program to reverse a string character by character.
		/*String str="java";
		char[] ch=str.toCharArray();
		for(int i=ch.length-1; i>=0; i--)
		{
			if(ch[i]!=' ')
			{
				System.out.print(ch[i]+" ");
			}
		}*/
		
		
		//7.Write a Java program to reverse a string word by word.
		
		/*String str="Delhi is a capital";
		String[] words=str.split(" ");
		for(int i=words.length-1;i>=0; i--)
		{
			System.out.print(words[i]+" ");
		}*/
		
		
		//8.Write a Java program to check whether a given string is a palindrome or not.
		
		/*String str="gfkwegfew";
		//char[] ch=str.toCharArray();
		String rev="";
		for(int i=str.length()-1;i>=0;  i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not Palindrom");
		}*/
		
		//9.Write a Java program to check whether two strings are anagrams of each other.
		
		/*String str1="Brag";
		String str2="Grab";
		
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
		}*/
		
	
		
		
		
		

		











	}

}
