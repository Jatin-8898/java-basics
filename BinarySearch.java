import java.io.*;
class BinarySearch
{	void bin(){	
	try{
		int i,j,temp,low,mid,high;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE VALUE OF NUM:");
		int num=Integer.parseInt(br.readLine());
		System.out.println("ENTER THE ELEMENTS OF ARRAY:");
		int[] array=new int[num];
		for(i=0;i<num;i++)
		{
			array[i]=Integer.parseInt(br.readLine());
		}
		for(i=0; i<num; i++)
		{	for(j=0; j<(num-i-1); j++)
			{	if(array[j] > array[j+1])
				{		
						temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
				}
			}
		}	
		System.out.println("SORTED ARRAY:");
		for(i=0;i<num;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("ENTER THE ELEMENT TO BE SEARCHED:");
		int search=Integer.parseInt(br.readLine());
		low=0;
		high=num-1;
		do{
			mid=(low+high)/2;
			if(search<array[mid])
			{
				high=mid-1;
			}
			else if(search>array[mid])
			{
				low=mid+1;
			}
		}while(search!=array[mid] && low<=high);
			if(search==array[mid])
			{	System.out.println("SEARCH SUCCESFUL");
				System.out.println("ELEMENT LOCATED AT:"+(mid+1));
			}	
			else
			System.out.println("NOT FOUND");
	}
	catch (Exception e){}
	}//end of func

	public static void main(String  args[]) 
	{
		BinarySearch bs=new BinarySearch();
		bs.bin();
	}
}
