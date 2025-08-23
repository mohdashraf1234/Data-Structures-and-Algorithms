package com.stringsss;

public class countTotalNumbersOfCharacters {
	public static void main(String[] args) {
		String str="This is an apple";
		char[]  ch=str.toCharArray();
		int count=0;
		for(int i=0;  i<ch.length-1;i++)
		{
			if(str.charAt(i)!=' ') {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
