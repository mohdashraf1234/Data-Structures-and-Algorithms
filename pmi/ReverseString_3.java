package com.pmi;

public class ReverseString_3 {
	
	public static void main(String[] args) {
		String str="Noida";
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}

}
