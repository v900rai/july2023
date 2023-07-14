package edu.jspider.StringClass;
//// to conver to the each and every character is frist upper case
public class howToCheckFristCharUpperCase 
{
	public static void main(String[] args) 
	{
	
		
			String s="i love india";
			System.out.println(s);
			convertToFristUpperCase( s);
			
		}
		public static void  convertToFristUpperCase(String s)
		{
			String res="";
			for(int i=0; i<s.length(); i++)
			{
				if(i==0)
				{
					String ch=""+s.charAt(i);
					res+=ch.toUpperCase();
				}
				else if(s.charAt(i) ==' ')
				{
					String ch=""+s.charAt(i+1);
					res+=" ";
					res+=ch.toUpperCase();
					i++;
				}
				else
				{
					res=res+s.charAt(i);
				}
				
		      }
			System.out.println(res);
			}
	}
	


