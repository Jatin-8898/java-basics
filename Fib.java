class Fib 
{
	public static void main(String[] args) 
	{
		int a=0,b=1,fib;
		for(int i=1;i<=7;i++)
				{		
					fib=a+b;
					System.out.println(fib);
					a=b;
					b=fib;
				}
	}
}
