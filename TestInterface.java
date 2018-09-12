interface CallBack
{	void Callback(int param);
}
class  Client implements CallBack
{	public  void Callback(int param)
	{	System.out.println("callback with"+param);
	}
}
class Client1 implements CallBack
{	public  void Callback(int p)
	{	System.out.println("callback with"+p);
	}
	void PrivateMethod()
	{	System.out.println("this is client1 private method");
	}
}

class TestInterface 
{
	public static void main(String[] args) 
	{
		CallBack c=new Client();
		c.Callback(42);
		Client1 obj =new Client1();
		obj.Callback(40);
		obj.PrivateMethod();
		c=obj;
		c.Callback(100);
		//c.privateMethod();
	}
}
