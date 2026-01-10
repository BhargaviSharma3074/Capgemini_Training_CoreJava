class NullPointerExceptions
{
	public static void main(String[] args)
	{
		String name = "Naman";
		//name = null;
		try
		{
			System.out.println(name.charAt(5));
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index Out Of Bounds Exception Handled");
		}
		
		try
		{
			System.out.println(name.length());
		}
		catch (NullPointerException e)
		{
			System.out.println("Null Pointer Exception Handled");
		}
		
	}
}