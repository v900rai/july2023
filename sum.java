package july;

public class sum 
{
	public  int sum(int a, int b)
	{
		return (a+b);
	}
	public  int sum(int a,int b, int c)
	{
		return (a+b+c);
	}
	public  double sum(double a, double b)
	{
		return(a+b);
	}
	public static void main(String []args)
	{
		sum s1=new sum();
		System.out.println(s1.sum(10, 20));
	  System.out.println(s1.sum(10, 30 ,40));
	  System.out.println(s1.sum(12.44, 12.44));
	}
	
	
	

}
