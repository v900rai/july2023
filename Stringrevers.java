package selfpratices;

public class Stringrevers 
{
	public static void main(String []args)
	{
		String str="hello vishal ";
		String rev="";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(str+"orijanal string");
		System.out.println(rev+"Revers string  ");
		
	}

	
	}


