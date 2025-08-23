package com.stringsss;

public class Trysol_Interview_Ques {
    public static void main(String[] args) {
        String str = "i love dog";

       str=str.replaceAll(" ", "");
       for(int i=0;  i<str.length();i++)
       {
    	   for(int j=0; j<str.length();  j++)
    	   {
    		   System.out.print(str.charAt(i));
    		   System.out.print(str.charAt(j)+" ");
    	   }
    	   System.out.println();
       }
       
       
    }
}
