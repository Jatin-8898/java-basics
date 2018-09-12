class GreaterTen 
{	public static void main(String args[]) 
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int sum=0;
		if(a>10 && b>10)
		{	sum=a+b;
			System.out.println(sum);
		}
		else
			System.out.println("INVALID");
	}
}
