import java.io.*;
class  Matrix
{	void mat()
{		try
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE NO OF ROWS N COLS:");
		int x=Integer.parseInt(br.readLine());
		int y=Integer.parseInt(br.readLine());
		int first[][]=new int[x][y];
		int second[][]=new int[x][y];
		int sum[][]=new int[x][y];
		int i,j;
		System.out.println("ENTER THE ELEMENTS OF FIRST MATRIX:");
		for( i=0;i<x;i++)
			for( j=0;j<y;j++)
			first[i][j]=Integer.parseInt(br.readLine());

		System.out.println("ENTER THE ELEMENTS OF SECOND MATRIX:");
		for( i=0;i<x;i++)
			for( j=0;j<y;j++)
			second[i][j]=Integer.parseInt(br.readLine());

		for( i=0;i<x;i++)
			for( j=0;j<y;j++)
			sum[i][j]=first[i][j]+second[i][j];
		
		System.out.println("SUM OF ENTERED MATRIX:");
		for( i=0;i<x;i++)
			for( j=0;j<y;j++)
		System.out.println(sum[i][j] + "\t");
	}
	catch (Exception e)
	{
	}
}
	public static void main(String[] args) 
	{
		Matrix obj=new Matrix();
		obj.mat();
	}
}
