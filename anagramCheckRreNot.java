package edu.jspider.StringClass;
import java.lang.reflect.Array;
import java.util.Arrays;
public class anagramCheckRreNot 
{
	public static void main(String[] args)
	{
		String s1="LISTEN";
		String s2="SILENT";
		/* String s1=LISTEN
		 * sTRING S2=SILENT
		 * To uppercase
		 * convert the string to char array
		 * sort  Array
		 * char back to string
		 * compare two the string are same
		 * are not check*/
		String str1=s1.toUpperCase();
		String str2=s1.toUpperCase();
		char[] chArr1= str1.toCharArray();
		char[] chArr2=str2.toCharArray();
		
		Arrays.sort(chArr1);
		Arrays.sort(chArr2);
		str1=new String(chArr1);
		str2=new String(chArr2);
		if(str1.equals(str2))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
		
		
		
	}

}
