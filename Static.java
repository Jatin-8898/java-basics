class Static 
{		static int a=3;		
		static int b;
		static void set(int x)
	{	System.out.println("x="+x);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("inside main");
		set(40);
	}
	static
	{	System.out.println("initilaizong static");
		b=a*4;
	}
}
