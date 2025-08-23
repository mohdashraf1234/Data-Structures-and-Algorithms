package com.stringsss;

public class reverseWordsByString_3 {
	public static void main(String[] args) {
		String s="   My name  is Ashraf";
		String[] words=s.split(" ");
		for(int i=words.length-1; i>=0; i--)
		{
			System.out.print(words[i]+"  ");
		}
	}

}
