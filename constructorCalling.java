package target200qQQQTTOOnnSS;

public class constructorCalling 
{
	public constructorCalling()
	{
		System.out.println();
		
	}
	public constructorCalling(int x, char y)
	{
		this();
		System.out.println(x+"   "+y);
	}
	public constructorCalling(double d)
	{
		this(100, 'a');
		System.out.println(d);
		
	}
	public static void main(String []args)
	{
		System.out.println("main starts");
		new constructorCalling(12.44);
		System.out.println("end the massage");
	}
	

}
