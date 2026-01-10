import java.util.Scanner;
class Child extends Parent
{
	String name = "Bhavya";
	static int age = 20;
	void Display()
	{
		String name = "John";
		int age = 2;
		System.out.println(name); //John
		System.out.println(age); //2
		System.out.println(this.name); //Bhavya
		System.out.println(this.age); //20
		System.out.println(super.name); //Bhargavi
		System.out.println(super.age); //21
	}
	public static void main(String[] args)
	{
		
	}
	
	Child()
	{
		this(10);
		//super();
		System.out.println("Child Constructor default");
	}

	Child(int a)
	{
		System.out.println("a-> "+a);
		System.out.println("Child Constructor int");
	}
	
}