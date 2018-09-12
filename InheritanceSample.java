class A
{	private int a,b;
	void set(int no1,int no2)
	{	a=no1;
		b=no2;
	}
	void display()
	{	System.out.println("a="+a+"b="+b);
	}
}
class B extends A
{	int c;
	void init(int no1,int no2,int no3)
	{		set(no1,no2);
		c=no3;
	}
void show()
{		display();
		System.out.println("c="+c);
}
}
class InheritanceSample
{		public static void main(String args[])
	{		B obj =new B();
			B obj1=new B();
			A ob = new A();
			obj.init(10,20,30);
			obj.c=100;
			ob.set(10,20);
			obj1.init(40,50,60);
			obj.show();
			obj1.show();
	}
}



