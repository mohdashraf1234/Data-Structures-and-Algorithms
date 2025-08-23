package com.stringsss;

public class reverseStringWordByWord {
	public static void main(String[] args) {
		
		String str="     This is really good";
		String [] words = str.split(" ");
		for(int i=words.length-1;  i>=0; i--)
		{
			System.out.print(words[i]+" ");
			if(i!=0)
			{
				System.out.print(" ");
			}
		}
		
		
		
	}

}
