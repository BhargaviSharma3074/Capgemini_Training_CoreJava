// create a class notebook, create two non static variables no of pages and price. use a method to accept these two data and initialise the variables, and create a display method. create two objects in the main method
import java.util.Scanner;
class Notebook
{
	public static void main(String[]args)
	{
		int pages = 445;
		int price = 1000;
		display(pages, price);
		
	}
	public static void display(int a, int b)
	{
		System.out.println("Pages: "+a);
		System.out.println("Price: "+b);
	}
}

//can a constructor be made private
// difference between static and non static variable