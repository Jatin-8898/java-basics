class Password
{	public static void main(String args[]) throws IOException
	{
			console c=System.console();
			if(c==null)
		{

				System.err.println("NO CONSOLE");
				System.exit(1);
		}
		
		String username=c.readLine("ENTER THE USERNAME:");
		char[] password=c.readPassword("ENTER THE PASSWORD:");

		if(!verify(username,password))
		{
			throw new SecurityException("INVALID CREDENTIALS");
		}
		Arrays.fill(password,' ');

	}
	private static final boolean verify(String username,char[] password)
	{
		return true;
	}

}
