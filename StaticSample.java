class StaticKeyword
{	static int a=3;
	static int b;
	static void set(int x)
	{	System.out.println("X="+x);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
static
	{	System.out.println("initializing static");
		b=a*4;
	}
}
class StaticSample
{	static
	{	System.out.println("inside staticsample class");
	}
	public static void main(String[] args)

	{	System.out.println("inside maiin");
		StaticKeyword obj1 =new StaticKeyword();    
		StaticKeyword obj2 =new StaticKeyword();
		obj1.a++;
		System.out.println(obj2.a);
		System.out.println(StaticKeyword.b);
		obj2.b=obj1.b+8;
		System.out.println(StaticKeyword.b);
		obj1.set(10);
		obj2.set(20);
		StaticKeyword.set(30);
}
}