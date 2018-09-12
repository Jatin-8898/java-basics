import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
class SuperString 
{

	public static void main(String[] args)
	{
	try
	{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ENTER THE STRING");
			String s=br.readLine();

			BufferedReader ty=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ENTER THE number");
			int i= Integer.parseInt(ty.readLine());
			
						
			System.out.println("ENTERED STRING IS="+s);
			System.out.println("s.charAt(6)="+s.charAt(6));
			System.out.println("ENTERED NO IS="+i);
			
	}
	catch (IOException e){}
}


}