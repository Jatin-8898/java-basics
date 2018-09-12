class Character
{
	public static void main(String[] args) 
	{
		String s="Java";
		int count;
		for(int i=1;i<=s.length();i++)
		{
				 if(Character.isLetter(s.charAt(i)))
				 count++;
			
		}		
		System.out.println("NUMBER OF CHARACTERS ARE:"+count);

	}
}
