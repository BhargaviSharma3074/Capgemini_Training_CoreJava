import java.util.Scanner;
class Polygon
{
	public static void main(String[] args)
	{
		System.out.println(areaOfRectangle(5,6));
		System.out.println(areaOfSquare(5));
		System.out.println(areaOfCircle(2.8));
		System.out.println(areaOfTriangle(10,20));
		
	}
	public static int areaOfRectangle(int a, int b)
	{
		return a*b;
	}
	public static int areaOfSquare(int a)
	{
		return a*a;
	}
	public static double areaOfCircle(double a)
	{
		return 3.14*a*a;	
	}
	public static double areaOfTriangle(int a, int b)
	{
		return 0.5*(double)a*(double)b;
	}
}