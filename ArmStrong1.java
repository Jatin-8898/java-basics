import java.io.*;
class ArmStrong 
{	
	void Arm()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ENTER THE NUMBER:");
			int num=Integer.parseInt(br.readLine());
			int check=0,rem;
			int n=num;
			while(num>0)
			{
				rem=num%10;
				check=check+(int)Math.pow(rem,3);
				num=num/10;
			}
			if(check==n)
				System.out.println("IS AN ARMSTONG NUMBER:");
			else
				System.out.println(n+"IS NOT ARMSTRONG NUMBER:");

		}
		catch (Exception e)
		{
		}
	}
	public static void main(String args[]) 
	{
		ArmStrong obj=new ArmStrong();
		obj.Arm();
	}
}
