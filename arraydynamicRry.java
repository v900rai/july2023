package edu.jspider.StringClass;
import java.util.Scanner;

public class arraydynamicRry
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size =sc.nextInt();
		int arr[]=new int[size];
		for(int i=0; i<=size; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("printed element ");
		for(int i=0; i<=size; i++)
		{
			System.out.println(arr[i]+"");
		}
		
	}

}
