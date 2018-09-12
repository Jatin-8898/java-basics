import java.io.*;
class  LongPrime
{	void prime()
	{		try
		{
			int flag;
			for (long i=-922337203854775808L;i<=922337203854775807L;i++)
			{
				flag=1;
			for(long j=2;j<=i/2;j++)
				
				if(i%j==0)
				{	flag=0;
					break;
				}
				if(flag==1)
					System.out.println("PRIME:"+i);
			}
		}
		catch (Exception e)
		{
		}
	}
	public static void main(String[] args) 
	{
		LongPrime obj=new LongPrime();
		obj.prime();
	}
}
 