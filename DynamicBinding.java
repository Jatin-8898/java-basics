class A
{	
	void CallMe()
	{	
		System.out.println("inside class A");
	}
}
class B extends A
{	
	void CallMe()
	{	
		System.out.println("inside class B");
	}
	
	void CallMeToo()
	{
		System.out.println("inside class b call me too");

	}
}
class C extends B
{	void CallMe()
	{	
		System.out.println("inside class c");
	}
}
class DynamicBinding
{
	public static void main(String[] args) 
	{	A a1 =new A();
		B b1 =new B();
		C c1 =new C();
		A ref;
		ref=a1;
		ref.CallMe();
		ref=b1;
		ref.CallMe();
		ref=c1;
		ref.CallMe();
	}
}
