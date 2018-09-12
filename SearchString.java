class  SearchString
{

	String T="This is a Sample texi";//my name is jatin and my full name is jatin varlyani
	String P="is";					//jatin
	

	void search(){

		int i, j;
		for(i=0;  i<T.length()-P.length();  i++)
		{
			for(j=0;  j<P.length();  j++)
			{	
				if(T.charAt(i+j) != P.charAt(j))
					break;
			}

			if(j == P.length())
				System.out.println("found at " +i);
		}
	}

	public static void main(String[] args) 
	{
		SearchString ob=new SearchString();
		ob.search();
	}
}
