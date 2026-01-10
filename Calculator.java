import java.util.Scanner;
class Calculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number: ");
		int a = sc.nextInt();
		System.out.print("Enter the 2nd number: ");
		int b = sc.nextInt();
		System.out.println("The sum of the two numbers is: "+add(a,b));
		System.out.println("The subtraction of the two numbers is: "+sub(a,b));
		System.out.println("The product of the two numbers is: "+mul(a,b));
		System.out.println("The division of the two numbers is: "+div(a,b));
		System.out.println("The remainder of the two numbers is: "+rem(a,b));
		System.out.println("The discounted price is: "+disc(a,b));
	}
	public static int add(int a, int b)
	{
		return a+b;
	}
	public static int sub(int a, int b)
	{
		return a-b;
	}
	public static int mul(int a, int b)
	{
		return a*b;
	}
	public static float div(float a, float b)
	{
		return a/b;
	}
	public static int rem(int a, int b)
	{
		return a%b;
	}
	public static float disc(float a, float b)
	{
		return a - (b/100)*a;
	}
}