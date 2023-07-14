package edu.jspider.StringClass;

public class StringConversions 
{

	public static void main(String[] args)
	{
		String s="Hello this is programming class";
		System.out.println(s);
		/*String res= s.toUpperCase();
		System.out.println(res);*/
		String res=covertToUpperCase(s);
		System.out.println(res);
		
		
		
	}
	public static  String  covertToUpperCase(String s)
	{
		String res="";
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			int asciiVal=ch-32;
			char uCH=(char)asciiVal;
			res=res+uCH;
		}
		return res;
		
	}

	
}
