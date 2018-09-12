import java.io.*;
class  Prime
{	void prime()
	{		try
		{
			int flag;
			for (int i=2;i<=30;i++){
				
				flag=1;

				for(int j=2;  j <= i/2;  j++){
				
					if(i%j == 0){
						flag=0;
						System.out.println(j);
						break;
					}
				}


				if(flag==1)
					System.out.println("PRIME:"+i);
			}
		}
		catch (Exception e){}
	}

	public static void main(String[] args) 
	{
		Prime obj=new Prime();
		obj.prime();
	}
}
 