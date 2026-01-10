import java.util.Scanner;
class Switch
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter the 1st operand: ");
float n = sc.nextFloat();
System.out.println("Enter the 2nd operand: ");
float m = sc.nextFloat();
System.out.println("Choose an operation: ");
System.out.println("1. Addition (+)");
System.out.println("2. Subtraction (-)");
System.out.println("3. Multiplication (*)");
System.out.println("4. Division (/)");
System.out.println("5. Modulo (%)");
System.out.print("1/2/3/4/5...?: ");
int op = sc.nextInt();
System.out.println("Result: ");
switch(op)
{
case 1: 
{
System.out.println(n+" + "+m+" = "+(n+m));
break;
}
case 2: 
{
System.out.println(n+" - "+m+" = "+(n-m));
break;
}
case 3: 
{
System.out.println(n+" * "+m+" = "+(n*m));
break;
}
case 4: 
{
System.out.println(n+" / "+m+" = "+(n/m));
break;
}
case 5: 
{
System.out.println(n+" % "+m+" = "+(n%m));
break;
}
default:
{
System.out.println("Please choose from the above selection and enter a valid operation.");
}
}
}
}