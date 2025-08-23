package com.stringsss;

public class input_mmmbbodd__4 {
    public static void main(String[] args) {
        String input = "mmbbeeo";

        if(input.isEmpty())
        {
        	System.out.println(" ");
        	return;
        }
        String result="";
        int count=1;
        for(int i=1; i<input.length(); i++)
        {
        	if(input.charAt(i)==input.charAt(i-1))
        	{
        		count++;
        	}
        	else
        	{
        		result=result+count+input.charAt(i-1);
        		count=1;
        	}
        }
        result=result+count+input.charAt(input.length()-1);
        System.out.println(result.toCharArray());
    }
}
