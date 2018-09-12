import java.io.*;
import java.math.BigInteger;
class BigFactorial 
{
	public static void main(String args[]) 
	{
		try
		{	
		BigInteger inc=new BigInteger("1");
		BigInteger fact=new BigInteger("1");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE NUMBER");
		int num=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=num;i++)
		{
			fact=fact.multiply(inc);
			inc=inc.add(BigInteger.ONE);
		}
		System.out.println(num+"!="+fact);
		}
		catch (Exception e)
		{
		}
	}
}       
