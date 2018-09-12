class NewThread extends Thread 
{		
		NewThread()
	{	super("DEMO THREAD");
		System.out.println("CHILD THREAD:"+this);
		start();
	}
	public void run()
{	try
	{
		for(int i=5;i>0;i--)
		{	
			System.out.println("CHILD THREAD:"+i);
			Thread.sleep(500);
		}
	}
	catch (InterruptedException e)
	{		
			System.out.println("CHILD INTERRUPTED");
	}
	System.out.println("EXITING FROM CHILD THREAD");
	}
}

class ExtendThread
{
	public static void main(String[] args) 
	{
		new NewThread();
		try
		{
			for(int i=5;i>=0;i--)
			{
				System.out.println("MAIN THREAD:"+i);
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e)
		{	
			System.out.println("MAIN THREAD INTERRUPTED");
		}
		System.out.println("MAIN THREAD EXITING");
}
}