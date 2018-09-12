import java.io.*;
class Factorial 
{		
void facto()
{
		try
	{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ENTER THE NUMBER");
			 double t=Integer.parseInt(br.readLine());	
			 double fact=1;
			for( double i=1;i<=t;i++)
			{		fact=fact*i;	
			}
	
		System.out.println("FACTORIAL IS="+fact);
	}
	catch (Exception e)
		{
		}
			
}
public static void main(String[] args)	
	{
			Factorial fb=new Factorial();
			fb.facto();
	}
}