class CallMe
{
	void call(String msg)
{
	System.out.println("["+msg);
	try
	{
		Thread.sleep(1000);
	}
	catch (InterruptedException e)
	{
		System.out.println("interrupted");
	}
}
}
class CallMe implements Runnable
{
		String m;
		Callme target;
		Thread t;
		public caller(Callme targ,String s)
	{	target=targ;
		m=s;
		t=newThread(this);
		t.start();
	}
	public void run()
	{	Synchronized (target)
		{	target.call(m);
		}
	}
}



class Synch 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Hello World!");
	}
}
