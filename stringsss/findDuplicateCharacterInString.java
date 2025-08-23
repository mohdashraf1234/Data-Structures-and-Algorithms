package com.stringsss;

public class findDuplicateCharacterInString {
	public static void main(String[] args) {
//		String str="Ashraaf";
//		char[] ch=str.toCharArray();
//		for(int i=0; i<ch.length; i++)
//		{
//			for(int j=i+1; j<ch.length-1; j++)
//			{
//				if(ch[i]==ch[j])
//				{
//					System.out.println(ch[j]);
//				}
//			}
//		}
		
		//find duplicateb words in this sentence
		
		String str="I like pen , but also but like  apple";
		String[] words=str.split(" ");
		for(int i=0; i<words.length;  i++)
		{
			for(int j=i+1; j<words.length-1; j++)
			{
				if(words[i].equals(words[j]))
				{
					System.out.println(words[i]+"  ");
				}
			}
		}
		
	}

}


