class A
{	A()
	{System.out.println("inside a");
	}
		}  
class B extends A
{	B()
	{System.out.println("inside B");
	}
}
class C extends B
{	C()
	{System.out.println("inside c");
	}
}
class MultiConst
{
	public static void main(String[] args) 
	{
		C obj=new C();
	}
}
