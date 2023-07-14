package edu.jspider.StringClass;
///wtap to check the sub string are not /// finding the sub string
public class checkTheStrinRreNot 
{
	///main="hello this is a class 
	/// sub ="this"
	public static void main(String[] args)
	{
		String main=" Hello This is a class";
		System.out.println(main);
		String sub="Thi s";
		boolean isSubstr=false;
		for(int i=0; i<main.length(); i++)
		{
			int j=0;
			int k=i;
			while(j<sub.length()&& main.charAt(k)==sub.charAt(j))
			{
				j++;
				k++;
			}
			if(j==sub.length())
			{
				isSubstr=true;
				break;
			}
		}
		if( isSubstr)
		{
			System.out.println("It is sub String");
		}
		else
		{
			System.out.println("It is NOT is sub String");
		}
		
		
	}

}
