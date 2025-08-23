package com.stringsss;

public class findLargestAndSmallestString {
    public static void main(String[] args) {
        String str = "Education is very important for every person";
        String[] words = str.split(" ");

       String largest=words[0];
       String smallest=words[0];
       for(int i=0;i<words.length; i++)
       {
    	   if(words[i].length()>largest.length())
    	   {
    		   largest=words[i];
    	   }
    	   if(words[i].length()<smallest.length())
    	   {
    		   smallest=words[i];
    	   }
       }
       System.out.println("Largest string is :"+largest);
       System.out.println("Smallest String is :"+smallest);
       
       
    }
}
