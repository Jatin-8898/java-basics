import java.io.*;
class  FileCopy
{
	public static void main(String[] args) 
	{
		try
		{
			int i;
			FileInputStream fin=new FileInputStream(args[0]);
			FileOutputStream fout=new FileOutputStream(args[1]);
			do{
				i=fin.read();
				if(i!=-1)
					fout.write(i);

			}
			while(i!=-1);
			fin.close();
			fout.close();
			}
		catch (Exception e)
		{

			System.out.println("error");
		}
	}
}
