import java.io.*;
class  Fibonacci
{	void fibo()
	{	
			try
			{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("ENTER THE TERMS");
				int t=Integer.parseInt(br.readLine());
				int a=0,b=1,fib=1;
				for(int i=1;i<=t-1;i++)
				{		
					System.out.println(fib);
					a=b;
					b=fib;
					fib=a+b;
				}
			}
			catch (Exception e)
			{
			}
	
	}
	public static void main(String[] args) 
	{
		Fibonacci f=new Fibonacci();
		f.fibo();
	}
}
