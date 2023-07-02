package target200qQQQTTOOnnSS;
import java.util.Scanner;
public class MultiplicationTable 
{
	public static  void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		for( int i=0; i<=10; i++)
		{
			System.out.print(num+ "*" +i+"=="+num*i);
		}
	}

}
