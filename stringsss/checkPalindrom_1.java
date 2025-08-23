package com.stringsss;

class checkPalindrom_1{
	public static void main(String[] args) {
		/*String s = "abba";
		char[] ch=s.toCharArray();
		String rev="";
		for(int i=ch.length-1; i>=0; i--)
		{
			rev=rev + s.charAt(i);

		}
		if(rev.equals(s))
		{
			System.out.println("This is palindrom");
		}
		else
		{
			System.out.println("This  is  not palindrom");
		}*/
		
		String s = "Abba";
        s = s.toLowerCase(); 

        StringBuilder rev = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }

        if (rev.toString().equals(s)) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
	}
}