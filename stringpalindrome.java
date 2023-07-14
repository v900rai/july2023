package edu.jspider.StringClass;

public class stringpalindrome 
{
	public static void main(String []args)
	{
		String str="vishal";
		 String rev="";
		 for(int i=str.length()-1; i>=0; i--)
		 {
			 char cha=str.charAt(i);
			 rev=rev+cha;
			 
		 }
		 System.out.println(rev);
		 if(str.equals(rev))
		 {
			 System.out.println("is palindrome String ");
		 }
		 else
		 {
			 System.out.println("it is not palindrome String");
		 }
	}

}
