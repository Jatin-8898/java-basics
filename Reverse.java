import java.io.*;
class Reverse
{
	void rev()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ENTER THE NUMBER");
			
			int n=Integer.parseInt(br.readLine());
			int r=0,rs;
			while(n>0)
			{	
					rs=n%10;
					r=r*10+rs;
					n=n/10;
			}
			System.out.println("REVERSE OF NUMBER IS:"+r);

		}
		catch (Exception e)
		{
		}
	}	
	public static void main(String[] args) 
	{
		Reverse obj=new Reverse();
		obj.rev();
	}
}
