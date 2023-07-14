package edu.jspider.StringClass;

public class countTheAlphabets

{
	public static void main(String[] args)
	{
		String s="aabbbcdeacd";
		String res="";
		for(int i=0; i<s.length(); i++)
		{
			int count =1;
			while((i<s.length()-1) && s.charAt(i)==s.charAt(i+1)) {
				count++;
			i++;
		}
		res=res+s.charAt(i);
		res=res+count;
	}
	System.out.println("the count duplicate character  "  +res);
}
}
//the count duplicate character  a2b3c1d1e1a1c1d1.... output
