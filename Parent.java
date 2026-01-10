import java.util.Scanner;
class Parent extends Object
{
	String name = "Bhargavi";
	static int age = 21;
	public static void Demo()
	{
		System.out.println("Static Demo Method");
	}
	public void Test()
	{
		System.out.println("Non Static Test Method");
	}
	
	{
		System.out.println("Non Static Initializer");
	}
	static
	{
		System.out.println("Static Inititializer");
	}
	
	Parent()
	{
		System.out.println("Constructor");
	}
}