class A
{	int no;
	void show()
	{	
		System.out.println("base no="+no);

	}
}
class B extends A
{
	int no;
	void show()
	{
			System.out.println("derived no="+no);
			super.show();
	}
	void set(int a,int b)
	{		no=b;
			super.no=a;
	}
}
class SuperKeyword
{	public static void main(String[] args) 
	{
		B obj=new B();
		obj.set(10,20);
		obj.show();
	}
}
