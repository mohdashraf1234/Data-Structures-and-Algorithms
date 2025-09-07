package com.leetcode.string;

public class Frequency {
	//frequency
	
	public static void main(String[] args) {
		String str = "Ashraf ali";
        str = str.toLowerCase();  // convert to lowercase (optional, for uniformity)

       int[] freq=new int[256];
       //count frequency
       for(char c:str.toCharArray())
       {
    	   if(c!=' ')
    	   {
    		   freq[c]++;
    	   }
       }
       
       //print frequency >1
       for(int i=0; i<freq.length; i++)
       {
    	   if (freq[i] > 0)
    	   {
    		   System.out.println((char)i+" : ->:"+freq[i]);
    	   }
    	  
       }
		 	
		
	}

}
