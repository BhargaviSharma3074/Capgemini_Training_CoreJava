//SYNTAX
/*
[access_modifier][modifier] return_type method_name([formal args])
{
[return(
}


//ACCESS MODIFIERS
/*
public -> can access it from any class
private -> can access it within the class where it is defined
protected -> accessible only in the same package or other subclasses in another package
default -> default access specifier used by the java compiler. accessible only from the package where it is declared
*/

//NON ACCESS MODIFERS
/*
keywords which are responsible to modify the characteristics of the method
eg - static, abstract, synchronized, volatile, final, transient, native 
*/

//RETURN TYPE
/*
type of return type
void -> can't return any value
primitive -> 
non primitive -> 

*/
//======================================================================================================================


import java.util.Scanner;
class Methods
{
/*
public static void main(String[]args)
{

System.out.println("Program starts");
sum();
System.out.println(add(5,52));
if(add(50,21)>100)
{
System.out.println("Pass");
}
else
{
System.out.println("Fail");
}
System.out.println("Program closed");
}


public static void sum()
{
int a = 10;
int b = 20;
int sum = a+b;
System.out.println(sum);
}

public static int add(int a, int b)
{
return a+b;
}
*/

public static void main(String[] args)
{
demo(10); // here int method is called because any number entered is by default int
//if int is not there, the code will search for a larger datatype
//int<long<float<double
//if none is there, will give error
//to return byte or short we use type casting
//demo((byte)10);
//demo((short)10);
}
public static void demo(byte a)
{
System.out.println("Byte method called");
}
public static void demo(short a)
{
System.out.println("Short method called");
}
public static void demo(int a)
{
System.out.println("Int method called");
}
public static void demo(long a)
{
System.out.println("Long method called");
}
public static void demo(float a)
{
System.out.println("Float method called");
}
public static void demo(double a)
{
System.out.println("Double method called");
}























}