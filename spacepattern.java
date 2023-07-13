package selfpratices;

public class spacepattern 
{
	public static void main(String []args)
	{
		System.out.println("Enter the pattern");
		for(int i=1; i<=4; i++)
		{
			for(int j=3; j>=i; j--)
				
			{
				System.out.print(" ");
				
				}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			}
	}

}
//// nested for using this program