class UnknownAgeException extends Exception 
{	
	UnknownAgeException(String msg)
	{
			super(msg);
	}	
}
class UserDefinedException
{
	public static void main(String[] args) 
	{	int age=-10;
		try
		{
			if(age<0)
				throw new UnknownAgeException("invalid age");
			else
			System.out.println("age accepted");
		}
		catch(UnknownAgeException e)
		{
			System.out.println(e);
		}
		
	}
}
