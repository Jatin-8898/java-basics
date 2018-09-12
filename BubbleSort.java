import java.io.*;
class BubbleSort
{	void bin()
	{	try
		{
		int i,j,temp;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE VALUE OF NUM:");
		int num=Integer.parseInt(br.readLine());
		System.out.println("ENTER THE ELEMENTS OF ARRAY:");
		int[] array=new int[num];
		for(i=0;i<num;i++)
		{
			array[i]=Integer.parseInt(br.readLine());
		}
		for(i=0;i<num;i++)
		{	for(j=0;j<(num-i-1);j++)
			{	if(array[j]>array[j+1])
				{		temp=array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
				}
			}
		}	
		System.out.println("SORTED ARRAY:");
		for(i=0;i<num;i++)
		{
			System.out.println(array[i]);
		}
	}
	catch (Exception e){}	
	}
	public static void main(String[] args) 
	{
		BubbleSort bs=new BubbleSort();
		bs.bin();
	}
}
