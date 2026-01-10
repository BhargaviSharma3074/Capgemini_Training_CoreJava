import java.util.Scanner;
class Exceptions
{
	public static void main(String[] args)
	{
		System.out.println("========Program Starts========");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number: ");
		int a = sc.nextInt();
		System.out.print("Enter the 2nd number: ");
		int b = sc.nextInt();
		String name = "Bhargavi";
		name = null;
		try
		{
			int c = a/b;
			System.out.println(c);
			System.out.println(name.charAt(5));
			System.out.println(name.length());
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index Out Of Bounds Exception Handled");
		}
		
		catch (NullPointerException e)
		{
			System.out.println("Null Pointer Exception Handled");
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Handled");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		catch (RuntimeException e)
		{
			System.out.println("Runtime Exception Handled");
		}
		catch (Exception e)
		{
			System.out.println("Exception Handled");
		}
		finally
		{
			System.out.println("Finally Executed");
			System.out.println("All Programs Closed");
		}
	
		System.out.println("========Program Closed========");
	}
}