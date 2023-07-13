package selfpratices;

import java.util.Scanner;

public class rangePrimeNumber 
{
	public static void main(String[] args)
	{
		int n1,n2;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n11=sc.nextInt();

		int n21=sc.nextInt();
	
		for(int i=n11; i<=n21; i++)
		{
			for(int j=2; j<=i; j++)
			{
				if(i%j==0)
				{
					break;
				}
				if(i==j)
				{
					System.out.println(j);
				}
				
			}
		}
		
		
	}

}
