class NewThread extends Thread 
{	int num=10;
	NewThread()
	{	
		start();
	}

public void run()
{	
	for(int i=0;i<num;i++)
	{
		if(i%2==0)
		{
			System.out.println("even="+i);
		}
	}
}
}
class EvenOdd
{
	public static void main(String[] args) 
	{
		int num=10;
		new NewThread();
		for(int i=0;i<num;i++)
		{
			if(i%2!=0)
			{	System.out.println("odd="+i);

			}
		}
	}
}
